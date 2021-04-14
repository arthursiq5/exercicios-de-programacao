const accordion = document.querySelector('[data-js="accordion"]');
accordion.addEventListener('click', event => {
    console.log(event.target.dataset);
});
