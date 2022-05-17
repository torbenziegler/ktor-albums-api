# Ktor Albums REST API (Work in progress)

Ktor was used to create this simple REST API

- Content Negotiation
- Call Logging
- Kotlinx Serialization
- Routing
- Monitoring

> The api can be run locally in an IDE of your choice or within a docker container. [Dockerfile](https://github.com/torbenziegler/ktor-albums-api/blob/main/Dockerfile) is available in the root directory.

## Endpoints

:grey_exclamation: **API is reachable with base url of https://ktor-albums-api-bgo52.ondigitalocean.app**

_Possible available endpoints:_

``` kotlin
/randomalbum // retrieve one random album
/albums // retrieve all albums
/albums/{name} // retrieve a specific album by its name
```

Sample response:

``` json
{
  "name": "Birds In The Trap Sing McKnight",
  "artist": "Travis Scott",
  "releaseYear": 2016,
  "imageUrl": "http://192.168.0.102:8100/album_covers/birds.jpg",
  "dominantColors": [
    "#242d3d",
    "#b97c78",
    "#595158",
    "#040407",
    "#93332a"
  ],
  "songs": [
    {
      "title": "the ends",
      "duration": "3:21"
    },
    {
      "title": "way back",
      "duration": "4:32"
    },
    {
      "title": "coordinate",
      "duration": "3:46"
    },
    {
      "title": "through the late night",
      "duration": "4:46"
    },
    {
      "title": "beibs in the trap",
      "duration": "3:33"
    },
    {
      "title": "sdp interlude",
      "duration": "3:11"
    },
    {
      "title": "sweet sweet",
      "duration": "3:42"
    },
    {
      "title": "outside",
      "duration": "2:56"
    },
    {
      "title": "goosebumps",
      "duration": "4:03"
    },
    {
      "title": "first take",
      "duration": "5:13"
    },
    {
      "title": "pick up the phone",
      "duration": "4:12"
    },
    {
      "title": "lose",
      "duration": "3:20"
    },
    {
      "title": "guidance",
      "duration": "3:27"
    },
    {
      "title": "wonderful",
      "duration": "3:36"
    }
  ]
}
```

## TODO

- Add crawler script to collect music data
- Move data to database
