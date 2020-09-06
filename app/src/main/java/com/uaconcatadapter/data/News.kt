package com.uaconcatadapter.data

class News(
    val id: Int,
    val title: String,
    val content: String,
    val topic: String,
    val isHighlighted: Boolean,
    val pictureUrl: String
) {
    companion object {
        fun getData(): List<News> {
            return listOf(
                News(
                    1,
                    "Covid-19 : masque, restaurants fermés, danse interdite… ces mesures prises au niveau local",
                    "La rentrée scolaire a eu lieu, de nombreux salariés ont repris le travail, et le nombre de nouveaux cas de Covid-19 en France augmente de jour en jour. Pour y remédier et limiter le risque que les hôpitaux voient affluer un nombre trop important de patients, les préfectures de plusieurs départements ont déjà imposé plusieurs restrictions.Dans les 28 départements classés depuis ce dimanche en « zone de circulation active du virus », les préfets disposent même d'un large arsenal de mesures leur permettant d'aller plus loin que leurs pouvoirs de police habituels. Ils peuvent, par exemple, limiter les déplacements autorisés ou interdire certains rassemblements.",
                    "Socièté",
                    true,
                    "https://www.leparisien.fr/resizer/Q4DcyLxAMDXZpunoKD0De5cfgE8=/932x582/cloudfront-eu-central-1.images.arcpublishing.com/leparisien/IGBUIHEED2U7JUONFTDNSDR7KM.jpg"
                ),
                News(
                    2,
                    "Coronavirus : pour Olivier Véran, \"Didier Raoult a dit des trucs qui étaient faux\"",
                    "Interviewé sur BFM TV, Olivier Véran s'est expliqué sur sa relation tendue avec le professeur Didier Raoult. Le directeur de l'IHU Méditerranée infection multiplie les piques contre le ministre de la Santé et la gestion de la crise par le gouvernement. \"On a un rapport qui n'est pas conflictuel. Quand on n'est pas d'accord on se le dit\", argue celui qui avait remplacé Agnès Buzyn au début de la crise.\n" +
                            "\n" +
                            "S'il reconnaît que Raoult \"a été très débrouillard dans la capacité à développer des tests\", il reste des désaccords de fond entre les deux médecins. \"Didier Raoult a dit des trucs qui étaient factuellement faux, tâcle Véran. Cela a parfois pu semer le trouble. Il a dit 'il n'y a pas de deuxième vague', après il a dit 'elle viendra de la Nouvelle-Zélande', après il a dit 'le virus mourra pendant l'été' manifestement non. Après il a dit 'peut-être que le virus a muté', on ne sait pas trop ce que ça veut dire... Je lui dis attention !\"\n" +
                            "\n" +
                            "Avant d'en remettre une deuxième couche sur l'hydroxychloroquine, le traitement prôné et utilisé par Didier Raoult à l'IHU. \"C'est un autre point sur lequel je ne suis fondamentalement pas d'accord. Il y a énormément de méta-analyses et données internationales qui font que la plupart des pays ont renoncé à l'hydroxychloroquine. Il n'y a aucune communauté scientifique digne de ce nom qui la recommande.\"\n" +
                            "\n" +
                            "\"Je suis ministre de la Santé et il est professeur de médecine à Marseille\", conclut Véran, qui refuse cependant de se prononcer sur la plainte contre Raoult auprès de l'ordre des médecins : \"Cela ne dépend pas du ministère de la Santé.\" ",
                    "Actualité",
                    false,
                    "https://images.laprovence.com/media/2020/09/05/1599321807_raoult-ve-ran.jpg?twic=v1/focus=572.5x289/cover=850x478"
                ),
                News(
                    3,
                    "Marseille : Tuba, un nouveau souffle aux Goudes\n",
                    "C'est un projet un peu fou pour lequel rien n'a été laissé au hasard. Il suffit de regarder la décoration soignée (en particulier dans les chambres, 5 au total) portant la signature de l'architecte Marion Mailaender pour s'en convaincre. Comprendre aussi le soin accordé ici à chaque détail, y compris sur la carte des menus qui table sur la qualité, le recours aux produits locaux, tout en affinant la présentation de plats simples mais goûteux.\n" +
                            "\n" +
                            "Tel que ce poisson à La Minorque, cuit à la plancha avec ses pommes de terre grenaille et ses légumes de saison. Tuba, comme l'ustensile indispensable aux plongeurs auquel l'établissement réservera une place de choix à l'avenir. Tuba, comme l'histoire de ces deux copains, Grégory Gassa, Fabrice Denisot, éloignés par les nécessités de la vie et du travail mais désireux de se retrouver pour bâtir une histoire commune. \"Il y a le clin d'oeil au monde sous-marin, au plongeur Jacques Mayol, il y a aussi une déclinaison locale de la cool attitude\", résume Grégory Gassa, toujours prompt à répondre aux demandes de la clientèle dans cet espace unique à Marseille, véritable balcon sur la mer à l'entrée du petit village des Goudes (8e).",
                    "Food",
                    false,
                    "https://images.laprovence.com/media/hermes/2020-09/2020-09-05/20200905_1_6_1_1_0_obj23066055_1.jpg?twic=v1/focus=321x222/cover=850x478"
                ),
                News(
                    4,
                    "La Ciotat : goût de terre dans l'eau, vers un retour à la normale",
                    "Il y a Corinne, habitante de la Madrague à Saint-Cyr-sur Mer, Ceyreste a été cité, mais le plus fort impact se trouve à La Ciotat. Au début du mois d'août, des riverains se sont plaints du goût terreux de l'eau provenant du robinet. Sur les réseaux sociaux, des poignets de témoignages. Quelques semaines après, la situation semble s'améliorer. \"Chez moi, elle n'a jamais été marron\", précise Élodie, qui réside à proximité de la piscine municipale, \"on note effectivement une légère amélioration. Mais, il reste un goût désagréable. Du coup, nous achetons des packs d'eau lourds. Je pense aux personnes âgées\". Dès le 7 août, \"nous avons contacté la municipalité.\"\n" +
                            "\n" +
                            "Quelques jours plus tard, la Société des eaux de Marseille, par le biais d'un communiqué adressé aux trois mairies, s'explique. \"Ce goût de terre, qui n'altère en rien la potabilité, est dû à la présence d'algues qui se sont développées dans la première phase du traitement de l'eau, la décantation, dans le centre de production d'eau potable\", souligne-t-on du côté de la SEM. Le traitement de l'eau est effectué dans un centre de production d'eau potable au travers de trois phases : la décantation, la filtration et la désinfection par injection de chlore. \"Ces algues, en période de fortes chaleurs et de luminosité, exceptionnellement intenses cette année depuis la fin du mois de juin, peuvent être responsables de ce goût de terre.\"",
                    "Ecoplanete",
                    false,
                    "https://images.laprovence.com/media/hermes/2020-09/2020-09-05/20200905_1_2_5_1_1_obj23066444_1.jpg?twic=v1/focus=321x268/cover=850x478"
                ),
                News(
                    5,
                    "Audiences TV : Koh-Lanta en tête devant Candice Renoir",
                    "Est-ce vraiment une surprise? Le deuxième numéro de l'émission de survie de TF1, « Koh-Lanta : les 4 terres », qui joue désormais la carte régionaliste entre quatre équipes - Sud, Nord, Est, Ouest – a remporté haut la main le trophée des audiences ce vendredi soir avec 5,479 millions d'aventuriers par procuration. Preuve qu'avec cette stratégie, même si elle est décriée par certains, la chaîne n'a pas perdu la boussole et sait qu'il faut diviser pour mieux régner.\n" +
                            "\n" +
                            "Dans sa roue, France 2 n'a toutefois pas à rougir de son score puisque la lumineuse Cécile Bois, alias le commandant Candice Renoir, qui enquêtait cette fois sur la mort d'un jeune homme accro aux jeux vidéo, a rassemblé 4,381 millions de fans.\n" +
                            "\n" +
                            "On attendait peut-être un peu plus du document réalisé par Serge Sampigny présenté par la 3, « Elle s'appelait Grace Kelly », animé par Stéphane Bern. Mais avec 1,827 million de téléspectateurs, la princesse s'est fait voler la vedette par M 6 et sa série policière « Bull » et son charismatique Michael Weatherly avec 2,306 millions d'adeptes. Nul doute que son personnage d'Anthony DiNozzo dans la série NCIS lui est un passeport pour engranger de beaux résultats partout où il se pose.",
                    "Télévision & médias",
                    false,
                    "https://www.leparisien.fr/resizer/Qtf8BRhgGZLUoMWw6BNQZY-CVpM=/932x582/cloudfront-eu-central-1.images.arcpublishing.com/leparisien/K3CNOAO6CYPPEL2SST6AWQADD4.jpg"
                ),
                News(
                    6,
                    "A Hongkong, une centaine de manifestants contre le report des législatives arrêté",
                    "Près d’une centaine de personnes ont été arrêtées par la police de Hongkong dimanche 6 septembre lors de rassemblements contre le report des élections législatives. Ce scrutin, l’un des plus ouverts du territoire semi-autonome, devait se tenir ce jour-là et permettre de renouveler le Conseil législatif (le LegCo).\n" +
                            "\n" +
                            "La chef de l’exécutif local, Carrie Lam, nommée par Pékin, avait annoncé le 31 juillet le report d’un an de ces élections en raison de l’épidémie de Covid-19, suscitant la colère de l’opposition. Vingt-deux députés de l’opposition avaient alors dénoncé la crise sanitaire comme un « prétexte permettant au gouvernement de confisquer le peu de démocratie qui existait encore à Hongkong ». Dimanche, des centaines de policiers antiémeute ont été déployés dans le quartier de Kowloon afin de contrecarrer les appels à manifester lancés sur Internet. Tout au long de l’après-midi, la police a été prise à partie par des manifestants qui scandaient « Rendez-moi mon vote » et « Flics corrompus », tandis que les policiers procédaient à de multiples interpellations, à des fouilles et ordonnaient à la foule de se disperser.",
                    "International",
                    true,
                    "https://img.lemde.fr/2020/09/06/0/0/4090/2450/688/0/60/0/f45cff6_281d570712b042c4ac9be6bd7bea91af-281d570712b042c4ac9be6bd7bea91af-0.jpg"
                ),
                News(
                    7,
                    "Coronavirus : à Lille, un étudiant propose des masques à prix cassés",
                    "\n" +
                            "Par Hélène Hannon\n" +
                            "Le 6 septembre 2020 à 12h41\n" +
                            "À 20 ans à peine, Maxime Paquet vit depuis un mois une véritable success story. Pour aider sa maman pharmacienne qui se désolait de ne plus pouvoir vendre de masques faute d'approvisionnement, ce jeune étudiant en troisième année de licence économie et finance à l'Université catholique de Lille (Nord), a décidé de lancer sa petite entreprise.\n" +
                            "\n" +
                            "Aujourd'hui, il croule sous les commandes de masques chirurgicaux qu'il vend au prix imbattable de 27 centimes l'unité TTC. Pour y arriver, Maxime a prospecté en Chine et il traite aujourd'hui directement avec l'usine. « Ça me prend pas mal de temps en parallèle de mes études et ça m'oblige à des horaires décalés. Je me lève en pleine nuit pour appeler mes fournisseurs chinois, mais le challenge me plaît. »",
                    "Économie",
                    false,
                    "https://www.leparisien.fr/resizer/S72AZqS5M8d9XixK9SSg2kXQSSs=/932x582/cloudfront-eu-central-1.images.arcpublishing.com/leparisien/E5NJG4ZADL3H4E2C2AR4CKJATA.jpg"
                ),
                News(
                    8,
                    "Dordogne : il fait exploser sa cuisine en voulant chasser une mouche",
                    "Une explosion qui aura fait plus de peur que de mal. Un homme a fait sauter une partie de sa maison en Dordogne, vendredi soir, en voulant chasser une mouche, rapportent Sud-Ouest et France Bleu Dordogne.\n" +
                            "\n" +
                            "A l'heure du dîner, cet habitant de Parcoul-Chenaud, une commune à 45 minutes de Libourne (Gironde), s'est trouvé importuné par une mouche dans sa cuisine. Il s'est muni d'une raquette électrique - qui tue les insectes à coups de décharges - dans l'espoir de la tuer.Malheureusement, un fourneau de sa cuisinière à gaz n'avait pas été éteint. Le choc entre la raquette et le gaz, qui s'était alors répandu dans la pièce, a provoqué une forte explosion, anéantissant au passage la cuisine et endommageant la toiture de l'habitation.\n" +
                            "\n" +
                            "Le retraité, âgé de 80 ans, a été victime d'une brûlure à la main, expliquent France Bleu et Sud Ouest. Il a été pris en charge à l'hôpital de Libourne, et sera bientôt relogé au camping de Parcoul-Chenaud.",
                    "Fait-Divers",
                    false,
                    "https://www.leparisien.fr/resizer/9PGiypB_AYsDGxhhu9gLb7JPZDY=/932x582/cloudfront-eu-central-1.images.arcpublishing.com/leparisien/4DV7QTTJZMG6YR44BPALIZXQZA.jpg"
                ),
                News(
                    9,
                    "MERCATO - PSG : KYLIAN MBAPPÉ \"ESPÈRE DE BONNES RECRUES\"",
                    "Kylian Mbappé ne s'en cache pas. Oui, la défaite en finale de Ligue des champions face au Bayern Munich a été difficile à \"digérer\". \"\"Bien sûr qu'on a des regrets. J'en ai, l'équipe en a. On a eu des occasions, j'ai une occasion, on aurait pu marquer et on savait que l'équipe qui allait marquer la première allait gagner\", a-t-il notamment expliqué à Téléfoot. Avant de fixer le cap sur la saison à venir.\"C'est triste à dire et difficile mais c'est malheureuement et heureusement notre vie, estime le champion du monde. Quand on gagne la Coupe du Monde et qu'on revient en club, on doit oublier. Là, on perd la Champions League et on doit oublier aussi, c'est une nouvelle saison. Bien sûr que c'était une déception incroyable mais c'est le métier qui veut ça.\" S'il croit à une possible victoire en C1, Mbappé espère désormais avoir des renforts sur le mercato.",
                    "Sport",
                    false,
                    "https://imgresizer.eurosport.com/unsafe/120x0/filters:format(webp):focal(1599x472:1601x470)/origin-imgresizer.eurosport.com/2020/08/19/2866790-59081808-2560-1440.jpg"
                ),
                News(
                    10,
                    "Coronavirus en France : sept nouveaux départements classés en « zone de circulation active du virus »",
                    "Le nombre de nouveaux cas de Covid-19 détectés en vingt-quatre heures en France a atteint, samedi 5 septembre, le chiffre de 8 550, proche du chiffre atteint la veille, le plus haut depuis le début de l’épidémie et le lancement des tests à grande échelle dans le pays, selon des données publiées par les autorités sanitaires. Les hospitalisations restent stables.Sept nouveaux départements sont passés en « zone de circulation active » du Covid-19, ou « zone rouge », ce qui porte à 28 le nombre de départements où des mesures renforcées contre le virus peuvent être adoptées, a annoncé un décret paru dimanche au Journal officiel.\n" +
                            "\n" +
                            "Le Nord, le Bas-Rhin, la Seine-Maritime, la Côte-d’Or – quatre départements qui comptent des agglomérations importantes, la métropole de Lille, Rouen, Le Havre, Strasbourg, Dijon –, les deux départements de Corse (Corse-du-Sud et Haute-Corse) et l’île de La Réunion sont concernés par ces nouvelles mesures.",
                    "Santé",
                    true,
                    ""
                )
            )
        }
    }
}

fun List<News>.highlightedNews(): List<News> {
    return this.filter { it.isHighlighted }
}

fun List<News>.otherNews(): List<News> {
    return this.filter { !it.isHighlighted }
}



