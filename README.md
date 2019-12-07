# m2-eai
Projet M2 MIAGE EAI - Gestion de formations

Ce projet vise à être une première version de gestion des formations. En ça, il présentera un prototype technique fonctionnel, sans pour autant réaliser toutes les fonctionnalités. Une partie de celles-ci sont externalisées pour cette V1 et seront réalisées dans une prochaine version.

## 4 Services
* Gestion des Formations
* Gestion des Ressources Humaines
* Gestion du Patrimoine
* Gestion Technico-Commerciale

### Gestion des Formations
__ServiceFormation__
Coeur de métier, permet de gérer les projets de formation.

Modeles :
* Projet
Services :
* gestionFormation
Enumerations :
* EnumEtat
* EnumType

### Gestion des Ressources Humaines
__ServiceRH__
Permet de gérer les formateurs.

Modeles :
* Formateur
Services :
* gestionFormateur
Enumerations :
* EnumStatutFormateur

### Gestion du Patrimoine
__ServicePatrimoine__
Permet de gérer les salles.

Modeles :
* Salle
Services :
* gestionSalle
Enumerations :
* EnumStatutSalle

### Gestion Technico-Commerciale
__ServiceTechnicoCommercial__
Permet de gérer des formations et des catalogues de formations.

Modeles :
* Catalogue
* Formation
Services :
* gestionCatalogue
* gestionFormation
Enumerations :
* EnumEtatFormation
* EnumTypeFormation


## Architecture JMS

Résumé de l'architecture JMS du prototype.

|ServiceFormation| --> sujetProjetsFormation  --> |ServiceP|  --> listeSalles
                                              --> |ServiceRH| --> listeFormateurs
                                              --> |ServiceTC| --> listeFormations

En résumé :
1. On crée un projet et on le liste dans un Sujet/Topic ;
2. Ce projet va avoir besoin d'une salle, d'un formateur et d'une formation associée (Fichiers/Queue dédiés) ;
3. On retourne un message selon la bonne création ou non du projet de formation.


