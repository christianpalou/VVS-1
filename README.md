# MabuRestaurant
[![N|Solid](http://mabu.es/assets/mabu.svg)](https://nodesource.com/products/nsolid)
Mabu Restaurant is a complete tool that manages the commercial image of your restaurant franchise on the internet. In contrast to the current solutions focuses on boosting and differentiate your brand against the competition.

  - Receive your orders online
  - Manage multiple channels
  - Easy reservation system

## Tech
Mabu Restaurant uses:

* [Angular4](angular.io)
* [HTML5](https://www.w3schools.com/html/html5_intro.asp)
* [CSS3](https://www.w3schools.com/css/css3_intro.asp)
* [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html)
* [Spring Boot](https://projects.spring.io/spring-boot/)

## Installation
#### Back-end
MabuRestaurant requires [Apache Maven](http://maven.apache.org/index.html) to run, and a [PostgreSQL](http://www.postgresql.org.es/) database, it can be configured throught application.yml
```sh
$ cd mabu-restaurant/backend/maburestaurantcore
# This will populate the database with some data, if you want a clear database run with -Denv = dev-init or if tables already exists use no arguments
$ mvn install spring-boot:run -Denv = dev-init-data
```

In case you want to run with an embebed database, run with
```sh
$ mvn install spring-boot:run -Denv = raspb
```


#### Front-end
Make sure your bakend is running. You can configure backend conection throught configuration.service.ts
MabuRestuarant requires [Node.js](https://nodejs.org/es/download/) to run.
Install the dependencies and devDependencies and start the server.
There will be 2.
##### Public App
Application that will allow the clients of the franchise to consult information, make orders, reserve tables ...
```sh
$ npm install -g angular-cli
$ cd mabu-restaurant/frontend/mbr-public
$ npm install
$ ng serve
```
##### Private App
Administration application.
```sh
$ npm install -g angular-cli
$ cd mabu-restaurant/frontend/mbr-private
$ npm install
$ ng serve
```


## Integration

* [Stripe](https://stripe.com)
* [Google Maps](https://developers.google.com/maps/?hl=es-419)
* [Apache Cordova](https://cordova.apache.org/)
* [Google Analytics](https://analytics.google.com/analytics/web/provision/?authuser=0#provision/SignUp/)

License
----

MIT


