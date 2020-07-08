mcVersion = "1.16.1"
title = "ModFest 1.16"
authors = listOf("Prospector", "B0undarybreaker")
modloader { fabric(Fabric.intermediary.v_1_16_1) }
icon = rootFolder.resolve("icon.png")

pack {
    multimc {
        // path tp the published modpack definition (not sk always)
        skPackUrl = "https://modfest.net/1.16/pack/modfest-1-16.json"
        selfupdateUrl = "https://modfest.net/1.16/pack/modfest-1-16.json"
    }
    voodoo {
        userFiles = FnPatternList(
                include = listOf("servers.dat")
        )
    }
}

root<Curse> {
    releaseTypes = setOf(FileType.Release, FileType.Beta, FileType.Alpha)
    it.list {
        // Deps
        +Mod.fabricApi {
            curse.fileID = FileID(2988824)
            curse.skipFingerprintCheck = true
        }
        +Mod.modmenu {
            curse.fileID = FileID(2988292)
            curse.skipFingerprintCheck = true
        }
        +Mod.fabricLanguageKotlin {
            curse.fileID = FileID(2989695)
            curse.skipFingerprintCheck = true
        }
        +Mod.fabricLanguageKotlin {
            curse.fileID = FileID(2989695)
            curse.skipFingerprintCheck = true
        }
        +Mod.roughlyEnoughItems {
            curse.fileID = FileID(2993832)
            curse.skipFingerprintCheck = true
        }
//        +Mod.canvasRenderer {
//            curse.fileID = FileID(2989428)
//        }
        +Mod.cardinalComponents {
            curse.fileID = FileID(2990259)
            curse.skipFingerprintCheck = true
        }
        +Mod.libblockattributes {
            curse.fileID = FileID(2981668)
            curse.skipFingerprintCheck = true
        }
        +Mod.malilib {
            curse.fileID = FileID(2993139)
            curse.skipFingerprintCheck = true
        }
//        (+ProjectID(306770)) { // Patchouli
//            curse.fileID = FileID(2986825)
//        }
        +Mod.cottonResources {
            curse.fileID = FileID(2993390)
            curse.skipFingerprintCheck = true
        }
        +Mod.hwyla {
            curse.fileID = FileID(2989943)
            curse.skipFingerprintCheck = true
        }

        // Utils
        +Mod.lithium {
            curse.fileID = FileID(2987754)
            curse.skipFingerprintCheck = true
        }
        +Mod.phosphor {
            curse.fileID = FileID(2987621)
            curse.skipFingerprintCheck = true
        }

        // Curse ModFest Mods
        (+ProjectID(390991)) { // AdventureZ
            curse.fileID = FileID(2995966)
            curse.skipFingerprintCheck = true
        }
//        (+ProjectID(391739)) { // Astromine
//            curse.fileID = FileID(2994662)
//            curse.skipFingerprintCheck = true
//        }
        (+ProjectID(391532)) { // Biomechanics
            curse.fileID = FileID(2995721)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(392045)) { // Biospheres
            curse.fileID = FileID(2990133)
            curse.skipFingerprintCheck = true
        }
//        +Mod.crusade {
//            curse.fileID = FileID(2993919)
//        }
        +Mod.deliciousDishes {
            curse.fileID = FileID(2991883)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(392015)) { // Eldritch Mobs
            curse.fileID = FileID(2996577)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(391796)) { // Glowcase
            curse.fileID = FileID(2999097)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(391257)) { // Heart of the Machine
            curse.fileID = FileID(2998444)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(391897)) { // Heart of the Machine
            curse.fileID = FileID(2993851)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(390001)) { // Herbocraft
            curse.fileID = FileID(2990657)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(391390)) { // Identity
            curse.fileID = FileID(2990840)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(391186)) { // Landmark
            curse.fileID = FileID(2994370)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(391812)) { // Mobs Attempt Parkour
            curse.fileID = FileID(2990365)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(391583)) { // ModUpdater
            curse.fileID = FileID(2992060)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(391937)) { // Muffle
            curse.fileID = FileID(2988542)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(391987)) { // Quantum Gems
            curse.fileID = FileID(2993585)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(390028)) { // Twine
            curse.fileID = FileID(2990466)
            curse.skipFingerprintCheck = true
        }
        (+ProjectID(391737)) { // Woods and Mires
            curse.fileID = FileID(2987851)
            curse.skipFingerprintCheck = true
        }

        group {
            optional {
                selected = false
            }
        }.list {
            +Mod.retino {
                curse.fileID = FileID(2913792)
                curse.skipFingerprintCheck = true
                description = "Fixes issues with retina display on Mac. Don't use otherwise."
            }
        }

        withTypeClass(Direct::class) { }.list {
            // Deps
            +"patchouli" {
                url = "https://cdn.discordapp.com/attachments/690273715166117899/727711990608560158/Patchouli-1.16-36.190.jar"
                skipFingerprintCheck = true
            }
            // Direct ModFest Mods
//            +"adventurez" {
//                url = "https://cdn.discordapp.com/attachments/690273715166117899/727648262143868980/adventurez-1.0.2.jar"
//            }
            +"astromine" {
                url = "https://github.com/Chainmail-Studios/Astromine/releases/download/1.0.30/astromine-1.0.30+fabric-1.16.1.jar"
                skipFingerprintCheck = true
            }
            +"astrum" {
                url = "https://github.com/The-Code-Monkey/ModFest/releases/download/1.0.1/astrum-1.0.0.jar"
                skipFingerprintCheck = true
            }
            +"attackOfTheBikeshed" {
                url = "https://github.com/comp500/attack-of-the-bikeshed/releases/download/1.0.1/bikeshed-1.0.1.jar"
                skipFingerprintCheck = true
            }
            +"blockwake" {
                url = "https://github.com/JSJBDEV/PiratesAndPlunderers/releases/download/0.6.1/Blockwake-1.16-0.6.1.jar"
                skipFingerprintCheck = true
            }
            +"boneCheese" {
                url = "https://cdn.discordapp.com/attachments/720484460197314590/727051566380744735/bonecheese-0.9.9-pre.9.9.9.9.9.9.but.without.the.include.but.reuploaded.because.prospector.deleted.t.jar"
                skipFingerprintCheck = true
            }
            +"cargoRockets" {
                url = "https://github.com/JoeZwet/CargoRockets/releases/download/0.1.0-alpha%2B1.16.1/CargoRockets-0.1.0-alpha+1.16.1.jar"
                skipFingerprintCheck = true
            }
            +"concraftwaylifeofgamemine" {
                url = "https://github.com/TheEpicBlock/concraftwaylifeofgamemine/releases/download/v1.1.0/concraftwaylifeofgamemine-1.1.0+1.16.1.jar"
                skipFingerprintCheck = true
            }
            +"cursed" {
                url = "https://cdn.discordapp.com/attachments/720484460197314590/727054419832864768/cursed-1.0.0-SNAPSHOT-without-the-debugging.jar"
                skipFingerprintCheck = true
            }
            +"fasterThanC" {
                url = "https://github.com/Snakefangox/FasterThanC/releases/download/modfest-hotfix-2/fasterthanc-1.7.jar"
                skipFingerprintCheck = true
            }
            +"flyCreeperFly" {
                url = "https://github.com/Scotsguy/fly-creeper-fly/releases/download/v1.0.0%2B1.16.1/fly-creeper-fly-1.0.0+1.16.1.jar"
                skipFingerprintCheck = true
            }
            +"haema" {
                url = "https://github.com/williambl/haema/releases/download/v1.1.1/haema-1.1.1.jar"
                skipFingerprintCheck = true
            }
            +"homestuckLoadingScreen" {
                url = "https://immibis.com/mcmodjam/homestuck_loading_screen-1.0.2.jar"
                skipFingerprintCheck = true
            }
            +"labyrinthine" {
                url = "https://github.com/FoundationGames/Labyrinthine/releases/download/0.1.2/labyrinthine-0.1.2.jar"
                skipFingerprintCheck = true
            }
            +"lacrimis" {
                url = "https://ci.dblsaiko.net/job/lacrimis/16/artifact/build/libs/lacrimis-1.1.2.jar"
                skipFingerprintCheck = true
            }
            +"lilTaterBlock" {
                url = "https://github.com/PheonixVX/lil-tater-block/releases/download/0.0.1-1.16/lil-tater-1368-revision-1.0.0.jar"
                skipFingerprintCheck = true
            }
            +"moreShulkerBoxes" {
                url = "https://cdn.discordapp.com/attachments/458307292421554178/728039942831472711/gud_modfest116_specialsauce-1.0.8.jar"
                skipFingerprintCheck = true
            }
            +"mycoturgy" {
                url = "https://github.com/Boundarybreaker/Mycoturgy/releases/download/1.0.2%2B1.16.1/mycoturgy-0.1.2+1.16.1.jar"
                skipFingerprintCheck = true
            }
            +"polyDungeons" {
                url = "https://github.com/Earthcomputer/PolyDungeons/releases/download/v1.0.3/polydungeons-1.0.3.jar"
                skipFingerprintCheck = true
            }
            +"potionOfGetHisAss" {
                url = "https://github.com/Scotsguy/potion-of-get-his-ass/releases/download/v1.1.2%2B1.16.1/potion-of-get-his-ass-1.1.2+1.16.1.jar"
                skipFingerprintCheck = true
            }
            +"rainbow" {
                url = "https://ci.hexeption.dev/job/Rainbow/job/master/15/artifact/build/libs/rainbow-1.16.1+1.0.1+build.15.jar"
                skipFingerprintCheck = true
            }
            +"rpgstats" {
                url = "https://cdn.discordapp.com/attachments/345364115726008332/727695753757327430/hahayesrpgstats-1.1.31.16.1.jar"
                skipFingerprintCheck = true
            }
            +"smolDragons" {
                url = "https://dblsaiko.net/pub/modfest/mods/smol-dragons-1.0.1.jar"
                skipFingerprintCheck = true
            }
            +"sunirl" {
                url = "https://github.com/TIVJ-dev/SunIRL/releases/download/1.1.1/sunirl-1.1.1.jar"
                skipFingerprintCheck = true
            }
            +"superworld" {
                url = "https://cdn.discordapp.com/attachments/720485528402657384/730131026512445470/superworld-1.0.0-pre.20.jar"
                skipFingerprintCheck = true
            }
            +"theManhattanProject" {
                url = "https://github.com/valoeghese/TheManhattanProject/releases/download/1.0.3/manhattan_project-1.0.3.jar"
                skipFingerprintCheck = true
            }
            +"crusade" {
                url = "https://cdn.discordapp.com/attachments/690273715166117899/727926651048165376/crusade-mod-1.1.11.16.1.jar"
                skipFingerprintCheck = true
            }

            // Direct Util Mods
//            +"carpet" {
//                url = "https://cdn.discordapp.com/attachments/690273715166117899/727654198359097367/fabric-carpet-1.16-1.4.0v200623-custom.jar"
//            }
            +"bruhMoment" {
                url = "https://cdn.discordapp.com/attachments/690273715166117899/727807352182407208/bruh-moment-0.2.0.jar"
                skipFingerprintCheck = true
            }
        }
    }
}
