const fetchPokemon = () => {
    const totalPokemons = 150;
    const getPokemonUrl = id => `https://pokeapi.co/api/v2/pokemon/${id}`;

    for (let id = 1; id <= totalPokemons; id++) {
        fetch(getPokemonUrl(id))
            .then(response => response.json());    
    }

    
};

fetchPokemon();