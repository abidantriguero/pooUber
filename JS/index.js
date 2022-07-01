    var car = new Car("AW456", new Account("Andres Herrera", "QWE234"))
    car.passenger = 4;
    car.printDataCar();

    var uberX = new UberX("AS678", new Account("Andrea Ferran", "ANDA765"), "Chevrolet", "Spark")
    uberX.passenger = 4;
    uberX.printDataCar();

    var uberPool = new UberPool("REW123", new Account("Andrew Endwer", "LKJG789"), "Aston Martin", "Road")
    uberPool.passenger = 4;
    uberPool.printDataCar();

    var uberBlack = new UberBlack("LKJ5647", new Account("Ruben Visconcy", "FGD835"), "Ford", "Focus")
    uberBlack.passenger = 4;
    uberBlack.printDataCar();

    var uberVan = new UberVan("MDN012", new Account("Jhon Wizdou", "FTR691"), "Toyota", "Cross")
    uberVan.passenger = 4;
    uberVan.printDataCar();

    var user = new User("Pepe Lucho", "123458SC", "pepe@platzi.io", "ERUI12345!@#$")
    user.printDataUser();