package de.torben.ziegler.data.model

@kotlinx.serialization.Serializable
data class Album(
    val name: String,
    val artist: String,
    val releaseYear: Int,
    val imageUrl: String,
    val dominantColors: List<String>?,
    val songs: List<Song>
)

object Albums {
    val albums = listOf(
        Album(
            "Rodeo",
            "Travis Scott",
            2015,
            "/static/album_covers/rodeo.jpg",
            listOf(
                "#593a28",
                "#313a34",
                "#a56446",
                "#efbbac",
                "#201e19"
            ),
            listOf(
                Song("Pornography", "3:51"),
                Song("Oh My Dis Side (feat. Quavo)", "5:51"),
                Song("3500 (feat. Future & 2 Chainz)", "7:41"),
                Song("Wasted (feat. Juicy J)", "3:55"),
                Song("90210 (feat. Kacy Hill)", "5:39"),
                Song("Pray 4 Love (feat. The Weeknd)", "5:07"),
                Song("Nightcrawler (feat. Swae Lee & Chief Keef)", "5:21"),
                Song("Piss On Your Grave (feat. Kanye West)", "2:46"),
                Song("Antidote", "4:22"),
                Song("Impossible", "4:02"),
                Song("Maria I'm Drunk (feat. Justin Bieber & Young Thug)", "5:49"),
                Song("Flying High (feat. Toro y Moi)", "3:28"),
                Song("I Can Tell", "3:55"),
                Song("Apple Pie", "3:39"),
                Song("Ok Alright (feat. ScHoolboy Q)", "6:57"),
                Song("Never Catch Me", "2:56"),

                )
        ),
        Album(
            "Birds In The Trap Sing McKnight",
            "Travis Scott",
            2016,
            "/static/album_covers/birds.jpg",
            listOf(
                "#242d3d",
                "#b97c78",
                "#595158",
                "#040407",
                "#93332a"
            ),
            listOf(
                Song("the ends", "3:21"),
                Song("way back", "4:32"),
                Song("coordinate", "3:46"),
                Song("through the late night", "4:46"),
                Song("beibs in the trap", "3:33"),
                Song("sdp interlude", "3:11"),
                Song("sweet sweet", "3:42"),
                Song("outside", "2:56"),
                Song("goosebumps", "4:03"),
                Song("first take", "5:13"),
                Song("pick up the phone", "4:12"),
                Song("lose", "3:20"),
                Song("guidance", "3:27"),
                Song("wonderful", "3:36")
            )
        ),
        Album(
            "ASTROWORLD",
            "Travis Scott",
            2018,
            "/static/album_covers/astroworld.jpg",
            listOf(
                "#b08854",
                "#6baada",
                "#bf5b10",
                "#551e0d",
                "#edc767"
            ),
            listOf(
                Song("STARGAZING", "4:30"),
                Song("CAROUSEL", "3:00"),
                Song("SICKO MODE", "5:12"),
                Song("R.I.P SCREW", "3:05"),
                Song("STOP TRYING TO BE GOD", "5:38"),
                Song("NO BYSTANDERS", "3:38"),
                Song("SKELETONS", "2:25"),
                Song("WAKE UP", "3:51"),
                Song("5% TINT", "3:16"),
                Song("NC-17", "2:36"),
                Song("ASTROTHUNDER", "2:22"),
                Song("YOSEMITE", "2:30"),
                Song("CAN'T SAY", "3:18"),
                Song("WHO? WHAT!", "2:56"),
                Song("BUTTERFLY EFFECT", "3:10"),
                Song("HOUSTONFORNICATION", "3:37"),
                Song("COFFEE BEAN", "3:29")
            )
        ),
        Album(
            "JACKBOYS",
            "Travis Scott",
            2019,
            "/static/album_covers/jackboys.jpg",
            listOf(
                "#5c4e0c",
                "#98657b",
                "#383302",
                "#d9d1b9",
                "#ab8605"
            ),
            listOf(
                Song("HIGHEST IN THE ROOM (feat. ROSALÍA & Lil Baby) - REMIX", "4:04"),
                Song("JACKBOYS", "0:46"),
                Song("GANG GANG", "4:04"),
                Song("HAD ENOUGH (feat. Quavo & Offset)", "2:37"),
                Song("OUT WEST (feat. Young Thug)", "2:37"),
                Song("WHAT TO DO? (feat. Don Doliver)", "4:10"),
                Song("GATTI", "3:01")
            )
        ),
        Album(
            "Un Verano Sin Ti",
            "Bad Bunny",
            2022,
            "/static/album_covers/unveranosinti.jpg",
            null,
            listOf(
                Song("Moscow Mule", "4:05"),
                Song("Después de la Playa", "3:50"),
                Song("Me Porto Bonito", "2:58"),
                Song("Tití Me Preguntó", "4:03"),
                Song("Un Ratito", "2:56"),
                Song("Yo No Soy Celoso", "3:50"),
                Song("Tarot", "3:57"),
                Song("Neverita", "2:53"),
                Song("La Corriente", "3:18"),
                Song("Efecto", "3:33"),
                Song("Party", "3:47"),
                Song("Aguacero", "3:30"),
                Song("Enséñame a Bailar", "2:56"),
                Song("Ojitos Lindos", "4:18"),
                Song("Dos Mil 16", "3:28"),
                Song("El Apagón", "3:21"),
                Song("Otro Atardecer", "4:04"),
                Song("Un Coco", "3:16"),
                Song("Andrea", "5:39"),
                Song("Me Fui de Vacaciones", "3:00"),
                Song("Un Verano Sin Ti", "2:28"),
                Song("Agosto", "2:19"),
                Song("Callaita", "4:10")
            )
        ),
        Album(
            "THE ALBUM",
            "BLACKPINK",
            2020,
            "https://i.scdn.co/image/ab67616d0000b2731895052324f123becdd0d53d",
            null,
            listOf(
                Song("How You Like That", "3:00"),
                Song("Ice Cream (with Selena Gomez)", "2:55"),
                Song("Pretty Savage", "3:19"),
                Song("Bet You Wanna (Feat. Cardi B)", "2:39"),
                Song("Lovesick Girls", "3:12"),
                Song("Crazy Over You", "2:41"),
                Song("Love To Hate Me", "2:49"),
                Song("You Never Know", "3:49")
            )
        ),
        Album(
            "Rare",
            "Selena Gomez",
            2020,
            "https://i.scdn.co/image/ab67616d0000b273b7526adff151e584dad4229d",
            null,
            listOf(
                Song("Rare", "3:40"),
                Song("Dance Again", "2:50"),
                Song("Look At Her Now", "2:42"),
                Song("Lose You To Love Me", "3:26"),
                Song("Ring", "2:28"),
                Song("Vulnerable", "3:12"),
                Song("People You Know", "3:14"),
                Song("Let Me Get Me", "3:9"),
                Song("Crowded Room (feat. 6LACK)", "3:6"),
                Song("Kinda Crazy", "3:32"),
                Song("Fun", "3:9"),
                Song("Cut You Off", "3:2"),
                Song("A Sweeter Place (feat. Kid Cudi)", "4:23")
            )
        ),
        Album(
            "Amor Prohibido",
            "Selena",
            1994,
            "https://i.scdn.co/image/ab67616d0000b273c26a4f2195b3ecf63d2a30ae",
            null,
            listOf(
                Song("Amor Prohibido", "2:52"),
                Song("No Me Queda Más", "3:20"),
                Song("Cobarde", "2:52"),
                Song("Fotos Y Recuerdos", "2:37"),
                Song("El Chico Del Apartamento 512", "3:28"),
                Song("Bidi Bidi Bom Bom - 1994 Version", "3:30"),
                Song("Techno Cumbia", "3:47"),
                Song("Tus Desprecios", "3:25"),
                Song("Si Una Vez", "2:47"),
                Song("Ya No", "3:55"),
                Song("Donde Quiera Que Estés", "4:33"),
                Song("Spoken Liner Notes By The Band And Family", "24:3"),
            )
        ),
        Album("Dangerous Woman", "Ariana Grande", 2016, "https://i.scdn.co/image/ab67616d0000b27333342c57a9b2c4e04c97b3f5", null, listOf(
            Song("Moonlight", "3:22"),
            Song("Dangerous Woman", "3:55"),
            Song("Be Alright", "2:59"),
            Song("Into You", "4:4"),
            Song("Side To Side", "3:46"),
            Song("Let Me Love You", "3:43"),
            Song("Greedy", "3:34"),
            Song("Leave Me Lonely", "3:49"),
            Song("Everyday", "3:14"),
            Song("Sometimes", "3:46"),
            Song("I Don't Care", "2:58"),
            Song("Bad Decisions", "3:46"),
            Song("Touch It", "4:20"),
            Song("Knew Better / Forever Boy", "4:59"),
            Song("Thinking Bout You", "3:20"),
        )),
        Album("Positions", "Ariana Grande", 2020, "https://i.scdn.co/image/ab67616d0000b2736484dfce3cc12e68d8aa2e55", null, listOf(
            Song("shut up", "2:37"),
            Song("34+35", "2:53"),
            Song("motive (with Doja Cat)", "2:47"),
            Song("just like magic", "2:29"),
            Song("off the table (with The Weeknd)", "3:59"),
            Song("six thirty", "3:3"),
            Song("safety net (feat. Ty Dolla \$ign)", "3:28"),
            Song("my hair", "2:38"),
            Song("nasty", "3:20"),
            Song("west side", "2:12"),
            Song("love language", "2:59"),
            Song("positions", "2:52"),
            Song("obvious", "2:26"),
            Song("pov", "3:21"),
        ))
    )
}
