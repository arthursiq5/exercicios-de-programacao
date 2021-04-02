const fetchPokemon = () => {
    const url = `https://pokeapi.co/api/v2/pokemon/25`;

    fetch(url) // puxando dados via ajax (ele retorna uma promise)
        .then(response => response.json())
        .then(pokemon => {
            console.log(pokemon)
        })
};

fetchPokemon();