# Citymapper Java API Wrapper
This Java module allows you to quickly connect the the Citymapper API.
Code is generated using Swagger with Retrofit and Gson as supporting libraries.

# Usage

Add the following maven dependency to your pom.xml

    <groupId>com.citymapper.api</groupId>
    <artifactId>citymapper-api-java</artifactId>
    <version>1.0-SNAPSHOT</version>

## Usage

To begin using this library, build a retrofit instance

```java
Retrofit retrofit = new ApiClient().getAdapterBuilder().build();
```

Create an api instance

```java
TravelTimeApi travelTimeApi = retrofit.create(TravelTimeApi.class);
```

Execute an api call and get the body

```java
final TravelTime time = travelTimeApi.traveltimeGet("51.5258156,-0.08833669999999999",
        "51.5094,-0.002124",
        null,
        null,
        "561b831b3b0cb3a98d9bba92397c7a34").execute().body();
```




