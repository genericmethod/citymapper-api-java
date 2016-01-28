# Citymapper Java API Wrapper
This Java module allows you to quickly connect the the [Citymapper API](http://www.citymapper.com/).
Code is generated using [Swagger](http://swagger.io/) with [Retrofit](http://square.github.io/retrofit/)
and [Gson](https://github.com/google/gson) as supporting libraries.

# Citymapper API Description file

The Citymapper API description file is based on the [Open API Specification](https://openapis.org/).
This description file can be used to generate an API client in a variety of programming languages.
Please refer to [swagger-codegen](https://github.com/swagger-api/swagger-codegen) to generate client code in other languages.

# Installation

Clone this repo to your local working directory.

```
git clone  https://github.com/genericmethod/citymapper-api-java.git
```

Install the dependency to your local repo. This will use the citymapper.yaml API definition file found
in the resources folder to generate the API client.

```
mvn clean install
````
Add the following maven dependency to your pom.xml

```xml
<dependency>
    <groupId>com.citymapper.api</groupId>
    <artifactId>citymapper-api-java</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
## Usage

To begin using this library, build a retrofit instance

```java
Retrofit retrofit = new ApiClient().getAdapterBuilder().build();
```

Create an API instance

```java
TravelTimeApi travelTimeApi = retrofit.create(TravelTimeApi.class);
```

Execute an API call and get the body

```java
final TravelTime time = travelTimeApi.traveltimeGet("51.5258156,-0.08833669999999999",
        "51.5094,-0.002124",
        null,
        null,
        "561b831b3b0cb3a98d9bba92397c7a34").execute().body();
```




