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
            console.log(pokemons)
        })
};

fetchPokemon();