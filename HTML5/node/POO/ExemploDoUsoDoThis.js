const person = {
    firstName: 'Walter',
    lastName: 'White',
    nickName: 'Heisenberg',
    getFullName () {
        const { firstName, lastName, nickName } = this;
        return `${firstName} ${lastName}, ou ${nickName}`;
    },
    printBio () {
        const fullName = this.getFullName();
        console.log(`${fullName} é um personagem da série Breaking Bad`);
    }
}

person.printBio();