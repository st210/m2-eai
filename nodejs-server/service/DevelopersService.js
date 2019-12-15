'use strict';


/**
 * Afficher les catalogues de formations
 *
 * idCatalogue Integer identifiant unique d'un catalogue (optional)
 * nomCatalogue String nom du catalogue (optional)
 * listeFormations List liste des formations associees au catalogue (optional)
 * returns List
 **/
exports.catalogue = function(idCatalogue,nomCatalogue,listeFormations) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "nomCatalogue" : "Catalogue des formations en developpement",
  "idCatalogue" : 10,
  "listeFormations" : "formation en Java ou C"
}, {
  "nomCatalogue" : "Catalogue des formations en developpement",
  "idCatalogue" : 10,
  "listeFormations" : "formation en Java ou C"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Afficher les clients
 *
 * idClient Integer identifiant unique d'un client (optional)
 * nom String nom d'un client (moral ou physique) (optional)
 * coordonnees String coordonnees d'un client (optional)
 * returns List
 **/
exports.client = function(idClient,nom,coordonnees) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "idClient" : 123,
  "coordoonnees" : "aistay.decendix@orange.fr",
  "nomClient" : "Orange"
}, {
  "idClient" : 123,
  "coordoonnees" : "aistay.decendix@orange.fr",
  "nomClient" : "Orange"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Afficher les demandes de formation
 *
 * idDemandeFormation Integer identifiant unique d'une demande de formation (optional)
 * formation String resume d'une formation et de ses specificites (optional)
 * intitule String description de la demande de formation (optional)
 * nbParticipant Integer nombre de participants s'inscrivant a la formation (optional)
 * client String nom et coordonnees du client demandant la formation (optional)
 * returns List
 **/
exports.demandeFormation = function(idDemandeFormation,formation,intitule,nbParticipant,client) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "idDemandeFormation" : 12,
  "client" : "Nom et coordoonnées du client",
  "nbParticipant" : 15,
  "formation" : "Formation courte de Java à 100€ / personne. Les objectifs de la formation sont tatati tatata.",
  "intitule" : "Developpement Java avance"
}, {
  "idDemandeFormation" : 12,
  "client" : "Nom et coordoonnées du client",
  "nbParticipant" : 15,
  "formation" : "Formation courte de Java à 100€ / personne. Les objectifs de la formation sont tatati tatata.",
  "intitule" : "Developpement Java avance"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Afficher les formateurs
 *
 * idFormateur Integer identifiant unique d'un formateur (optional)
 * nomFormateur String nom d'un formateur (optional)
 * prenomFormateur String prenom d'un formateur (optional)
 * listeCompetences List competences d'un formateur (optional)
 * returns List
 **/
exports.formateur = function(idFormateur,nomFormateur,prenomFormateur,listeCompetences) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "listeCompetences" : "Java, PHP",
  "prenomFormateur" : "Maxime",
  "idFormateur" : 13,
  "nomFormateur" : "Viala"
}, {
  "listeCompetences" : "Java, PHP",
  "prenomFormateur" : "Maxime",
  "idFormateur" : 13,
  "nomFormateur" : "Viala"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Afficher les formations
 *
 * idFormation Integer identifiant unique d'une formation (optional)
 * intitule String nom d'une formation (optional)
 * type String  (optional)
 * returns List
 **/
exports.formation = function(idFormation,intitule,type) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "capaciteMax" : 20,
  "listeSalles" : "salle1, salle",
  "tarif" : "1000€ / personne",
  "capaciteMin" : 5,
  "description" : "Formation pour apprendre le langage Java",
  "listeFormateurs" : "Maxime Viala, Guillaume Ringue",
  "idFormation" : 1,
  "type" : "Courte",
  "intitule" : "Java",
  "etat" : "En projet",
  "periode" : "2019-07-31T00:00:00.000+0000"
}, {
  "capaciteMax" : 20,
  "listeSalles" : "salle1, salle",
  "tarif" : "1000€ / personne",
  "capaciteMin" : 5,
  "description" : "Formation pour apprendre le langage Java",
  "listeFormateurs" : "Maxime Viala, Guillaume Ringue",
  "idFormation" : 1,
  "type" : "Courte",
  "intitule" : "Java",
  "etat" : "En projet",
  "periode" : "2019-07-31T00:00:00.000+0000"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Afficher les salles
 *
 * idSalle Integer identifiant unique d'une salle (optional)
 * materiel String description du materiel present dans la salle (optional)
 * statut String  (optional)
 * returns List
 **/
exports.salle = function(idSalle,materiel,statut) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "materiel" : "Projecteur",
  "idSalle" : 2,
  "statut" : "affectee"
}, {
  "materiel" : "Projecteur",
  "idSalle" : 2,
  "statut" : "affectee"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

