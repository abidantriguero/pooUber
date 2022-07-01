class Driver extends Account {
    constructor(name, document, email, password){
        super(name, document)
        this.email = email;
        this.password = password;
    }
    printDataDriver() {
        console.log(this.name);
        console.log(this.document);
        console.log(this.email);
        console.log(this.password);
    }
}