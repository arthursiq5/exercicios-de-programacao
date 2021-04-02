const person = {
    firstName: 'Walter',
    lastName: 'White',
    nickName: 'Heisenberg',
    getFullName () {
        const { firstName, lastName, nickName } = this;
        console.log(`${firstName} ${lastName}, ou ${nickName}`);
    }
}

person.getFullName();