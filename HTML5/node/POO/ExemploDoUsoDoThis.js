const person = {
    firstName: 'Walter',
    lastName: 'White',
    nickName: 'Heisenberg',
    getFullName () {
        console.log(`${this.firstName} ${this.lastName}, ou ${this.nickName}`);
    }
}

person.getFullName();