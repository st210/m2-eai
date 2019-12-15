'use strict';

var utils = require('../utils/writer.js');
var Developers = require('../service/DevelopersService');

module.exports.catalogue = function catalogue (req, res, next) {
  var idCatalogue = req.swagger.params['idCatalogue'].value;
  var nomCatalogue = req.swagger.params['nomCatalogue'].value;
  var listeFormations = req.swagger.params['listeFormations'].value;
  Developers.catalogue(idCatalogue,nomCatalogue,listeFormations)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.client = function client (req, res, next) {
  var idClient = req.swagger.params['idClient'].value;
  var nom = req.swagger.params['nom'].value;
  var coordonnees = req.swagger.params['coordonnees'].value;
  Developers.client(idClient,nom,coordonnees)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.demandeFormation = function demandeFormation (req, res, next) {
  var idDemandeFormation = req.swagger.params['idDemandeFormation'].value;
  var formation = req.swagger.params['formation'].value;
  var intitule = req.swagger.params['intitule'].value;
  var nbParticipant = req.swagger.params['nbParticipant'].value;
  var client = req.swagger.params['client'].value;
  Developers.demandeFormation(idDemandeFormation,formation,intitule,nbParticipant,client)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.formateur = function formateur (req, res, next) {
  var idFormateur = req.swagger.params['idFormateur'].value;
  var nomFormateur = req.swagger.params['nomFormateur'].value;
  var prenomFormateur = req.swagger.params['prenomFormateur'].value;
  var listeCompetences = req.swagger.params['listeCompetences'].value;
  Developers.formateur(idFormateur,nomFormateur,prenomFormateur,listeCompetences)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.formation = function formation (req, res, next) {
  var idFormation = req.swagger.params['idFormation'].value;
  var intitule = req.swagger.params['intitule'].value;
  var type = req.swagger.params['type'].value;
  Developers.formation(idFormation,intitule,type)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.salle = function salle (req, res, next) {
  var idSalle = req.swagger.params['idSalle'].value;
  var materiel = req.swagger.params['materiel'].value;
  var statut = req.swagger.params['statut'].value;
  Developers.salle(idSalle,materiel,statut)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
