<?php
require_once "Car.php";
require_once "Account.php";
$car = new Car("ATC123", new Account("Abidan Triguero", "QWER123"));
$car->printDataCar();
