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
        }
        +Mod.modmenu {
            curse.fileID = FileID(2988292)
        }
        +Mod.fabricLanguageKotlin {
            curse.fileID = FileID(2989695)
        }
        +Mod.fabricLanguageKotlin {
            curse.fileID = FileID(2989695)
        }
        +Mod.roughlyEnoughItems {
            curse.fileID = FileID(2993643)
        }
//        +Mod.canvasRenderer {
//            curse.fileID = FileID(2989428)
//        }
        +Mod.cardinalComponents {
            curse.fileID = FileID(2990259)
        }
        +Mod.libblockattributes {
            curse.fileID = FileID(2981668)
        }
        +Mod.malilib {
            curse.fileID = FileID(2993139)
        }
//        (+ProjectID(306770)) { // Patchouli
//            curse.fileID = FileID(2986825)
//        }
        +Mod.cottonResources {
            curse.fileID = FileID(2993390)
        }

        // Utils
        +Mod.worldedit {
            curse.fileID = FileID(2988278)
        }
        +Mod.makkit {
            curse.fileID = FileID(2986981)
        }
        +Mod.lithium {
            curse.fileID = FileID(2987754)
        }
        +Mod.phosphor {
            curse.fileID = FileID(2987621)
        }

        // Curse ModFest Mods
//        (+ProjectID(390991)) { // AdventureZ
//            curse.fileID = FileID(2988048)
//        }
        (+ProjectID(391739)) { // Astromine
            curse.fileID = FileID(2993665)
        }
        (+ProjectID(391532)) { // Astrum
            curse.fileID = FileID(2988088)
        }
        (+ProjectID(392045)) { // Biospheres
            curse.fileID = FileID(2990133)
        }
        +Mod.crusade {
            curse.fileID = FileID(2989686)
        }
        +Mod.deliciousDishes {
            curse.fileID = FileID(2991883)
        }
        (+ProjectID(392015)) { // Eldritch Mobs
            curse.fileID = FileID(2993480)
        }
        (+ProjectID(391796)) { // Glowcase
            curse.fileID = FileID(2993641)
        }
        (+ProjectID(391897)) { // Heart of the Machine
            curse.fileID = FileID(2988449)
        }
        (+ProjectID(390001)) { // Herbocraft
            curse.fileID = FileID(2990657)
        }
        (+ProjectID(391390)) { // Identity
            curse.fileID = FileID(2990840)
        }
        (+ProjectID(391186)) { // Landmark
            curse.fileID = FileID(2992734)
        }
        (+ProjectID(391812)) { // Mobs Attempt Parkour
            curse.fileID = FileID(2990365)
        }
        (+ProjectID(391583)) { // ModUpdater
            curse.fileID = FileID(2992060)
        }
        (+ProjectID(391937)) { // Muffle
            curse.fileID = FileID(2988542)
        }
        (+ProjectID(391987)) { // Quantum Gems
            curse.fileID = FileID(2993585)
        }
        (+ProjectID(390028)) { // Twine
            curse.fileID = FileID(2990466)
        }
        (+ProjectID(391737)) { // Woods and Mires
            curse.fileID = FileID(2987851)
        }

        group {
            optional {
                selected = false
            }
        }.list {
            +Mod.retino {
                curse.fileID = FileID(2913792)
                description = "Fixes issues with retina display on Mac. Don't use otherwise."
            }
            +Mod.minihud {
                curse.fileID = FileID(2993429)
                description = "Displays server TPS and MSPT. Helpful for debugging."
            }
        }

        withTypeClass(Direct::class) { }.list {
            // Deps
            +"patchouli" {
                url = "https://cdn.discordapp.com/attachments/690273715166117899/727711990608560158/Patchouli-1.16-36.190.jar"
            }
            // Direct ModFest Mods
            +"adventurez" {
                url = "https://cdn.discordapp.com/attachments/690273715166117899/727648262143868980/adventurez-1.0.2.jar"
            }
            +"astrum" {
                url = "https://github.com/The-Code-Monkey/ModFest/releases/download/1.0.1/astrum-1.0.0.jar"
            }
            +"attackOfTheBikeshed" {
                url = "https://github.com/comp500/attack-of-the-bikeshed/releases/download/1.0.1/bikeshed-1.0.1.jar"
            }
            +"blockwake" {
                url = "https://github.com/JSJBDEV/PiratesAndPlunderers/releases/download/0.6.1/Blockwake-1.16-0.6.1.jar"
            }
            +"boneCheese" {
                url = "https://cdn.discordapp.com/attachments/720484460197314590/727051566380744735/bonecheese-0.9.9-pre.9.9.9.9.9.9.but.without.the.include.but.reuploaded.because.prospector.deleted.t.jar"
            }
            +"cargoRockets" {
                url = "https://github.com/JoeZwet/CargoRockets/releases/download/0.1.0-alpha%2B1.16.1/CargoRockets-0.1.0-alpha+1.16.1.jar"
            }
            +"concraftwaylifeofgamemine" {
                url = "https://github.com/TheEpicBlock/concraftwaylifeofgamemine/releases/download/v1.1.0/concraftwaylifeofgamemine-1.1.0+1.16.1.jar"
            }
            +"cursed" {
                url = "https://cdn.discordapp.com/attachments/720484460197314590/727054419832864768/cursed-1.0.0-SNAPSHOT-without-the-debugging.jar"
            }
            +"fasterThanC" {
                url = "https://github.com/Snakefangox/FasterThanC/releases/download/modfest/fasterthanc-1.0.jar"
            }
            +"flyCreeperFly" {
                url = "https://github.com/Scotsguy/fly-creeper-fly/releases/download/v1.0.0%2B1.16.1/fly-creeper-fly-1.0.0+1.16.1.jar"
            }
            +"haema" {
                url = "https://github.com/williambl/haema/releases/download/v1.0.0/haema-1.0.0.jar"
            }
            +"homestuckLoadingScreen" {
                url = "https://immibis.com/mcmodjam/homestuck_loading_screen-1.0.0.jar"
            }
            +"labyrinthine" {
                url = "https://github.com/FoundationGames/Labyrinthine/releases/download/0.1.1/labyrinthine-0.1.1.jar"
            }
            +"lacrimis" {
                url = "https://ci.dblsaiko.net/job/lacrimis/lastSuccessfulBuild/artifact/build/libs/lacrimis-1.0.7.jar"
            }
            +"lilTaterBlock" {
                url = "https://github.com/PheonixVX/lil-tater-block/releases/download/0.0.1-1.16/lil-tater-1368-revision-1.0.0.jar"
            }
            +"moreShulkerBoxes" {
                url = "https://cdn.discordapp.com/attachments/458307292421554178/727749737217785916/gud_modfest116_specialsauce-1.0.7.jar"
            }
            +"mycoturgy" {
                url = "https://github.com/Boundarybreaker/Mycoturgy/releases/download/0.1.0%2B1.16.1/mycoturgy-0.1.0+1.16.1.jar"
            }
            +"polyDungeons" {
                url = "https://github.com/Earthcomputer/PolyDungeons/releases/download/v1.0/polydungeons-1.0.jar"
            }
            +"potionOfGetHisAss" {
                url = "https://github.com/Scotsguy/potion-of-get-his-ass/releases/download/v1.1.2%2B1.16.1/potion-of-get-his-ass-1.1.2+1.16.1.jar"
            }
            +"rainbow" {
                url = "https://ci.hexeption.dev/job/Rainbow/job/master/15/artifact/build/libs/rainbow-1.16.1+1.0.1+build.15.jar"
            }
            +"rpgstats" {
                url = "https://cdn.discordapp.com/attachments/345364115726008332/727695753757327430/hahayesrpgstats-1.1.31.16.1.jar"
            }
            +"smolDragons" {
                url = "https://cdn.discordapp.com/attachments/720484460197314590/727050999868686337/smol-dragons-1.0.1.jar"
            }
            +"sunirl" {
                url = "https://github.com/TIVJ-dev/SunIRL/releases/download/1.1/sunirl-1.1.jar"
            }
            +"superworld" {
                url = "https://cdn.discordapp.com/attachments/720484460197314590/726354727545339945/superworld-1.0.0-pre.6.jar"
            }
            +"theManhattanProject" {
                url = "https://cdn.discordapp.com/attachments/690273715166117899/727634754035253292/manhattan_project-1.0.2.jar"
            }

            // Direct Util Mods
//            +"carpet" {
//                url = "https://cdn.discordapp.com/attachments/690273715166117899/727654198359097367/fabric-carpet-1.16-1.4.0v200623-custom.jar"
//            }
        }
    }
}
