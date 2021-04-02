const fetchPokemon = () => {
    const totalPokemons = 150;
    const getPokemonUrl = id => `https://pokeapi.co/api/v2/pokemon/${id}`;

    const pokemonPromises = [];

    for (let id = 1; id <= totalPokemons; id++) {
        pokemonPromises.push(
            fetch(getPokemonUrl(id))
                .then(response => response.json()));
    }

    Promise.all(pokemonPromises)
        .then(pokemons => {
            // console.log(pokemons)

            const lisPokemons = pokemons.reduce((accumulator, pokemon) => {
                const types = pokemon.types.map(typeInfo => typeInfo.type.name)

                accumulator += `<li class="card">
                    <img class="card-image ${types[0]}" alt="${pokemon.name}" src="">
                    <h2 class="card-title">${pokemon.id}. ${pokemon.name}</h2>
                    <p class="card-subtitle">${types.join(' | ')}</p>
                </li>`;
                return accumulator;
            }, '');
            console.log(lisPokemons);
        })
};

fetchPokemon();