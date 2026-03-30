# TP-2-Java

# Système de Gestion Bancaire en Java

## Description

Ce projet est une application de gestion bancaire développée en Java dans le cadre d’un exercice de programmation orientée objet.

L’application permet de gérer une banque contenant plusieurs comptes bancaires et d’effectuer les opérations principales suivantes :

* création de comptes bancaires ;
* dépôt d’argent ;
* retrait avec gestion du découvert autorisé ;
* virement entre comptes ;
* calcul des intérêts ;
* affichage des informations des comptes.

---

## Fonctionnalités

### Gestion des comptes bancaires

Chaque compte bancaire possède :

* un numéro unique généré automatiquement ;
* le nom du titulaire ;
* un solde ;
* un découvert autorisé.

### Opérations disponibles

* Ajouter un compte à une banque
* Déposer un montant sur un compte
* Retirer un montant si le découvert autorisé n’est pas dépassé
* Effectuer un virement entre deux comptes
* Calculer les intérêts appliqués au solde
* Afficher les informations de tous les comptes

---

## Structure du projet

```text
TP2/
├── Banque.java
├── CompteBancaire.java
└── TestBanque.java
```

### `CompteBancaire.java`

Classe représentant un compte bancaire.

#### Attributs principaux

```java
private int numero;
private String titulaire;
private double solde;
private double decouvertAutorise;
```

#### Attributs statiques

```java
private static int nbComptes;
private static double tauxinteret = 0.03;
```

#### Méthodes principales

| Méthode                                             | Description                               |
| --------------------------------------------------- | ----------------------------------------- |
| `deposer(double montant)`                           | Ajoute un montant au solde                |
| `retirer(double montant)`                           | Retire un montant si le solde le permet   |
| `virmentvers(CompteBancaire autre, double montant)` | Effectue un virement vers un autre compte |
| `calculerSoldeAvecInterets()`                       | Applique le taux d’intérêt standard       |
| `calculerSoldeAvecInterets(double bonus)`           | Applique un taux d’intérêt avec bonus     |
| `afficher()`                                        | Affiche les informations du compte        |

---

### `Banque.java`

Classe représentant une banque contenant plusieurs comptes.

#### Responsabilités

* stocker les comptes bancaires dans un tableau ;
* ajouter de nouveaux comptes ;
* afficher tous les comptes enregistrés.

#### Exemple

```java
Banque b = new Banque("MarocBank", 1500);
```

---

### `TestBanque.java`

Classe contenant la méthode `main` utilisée pour tester le fonctionnement de l’application.

#### Scénario de test

```java
Banque b = new Banque("MarocBank", 1500);

CompteBancaire c1 = new CompteBancaire("Yassine", 1234, 500);
CompteBancaire c2 = new CompteBancaire("Mohamed", 1200, 500);
CompteBancaire c3 = new CompteBancaire("Ahmed", 1000, 500);

b.ajouterCompte(c1);
b.ajouterCompte(c2);
b.ajouterCompte(c3);

c1.deposer(1111);
c1.retirer(200);
c2.virmentvers(c3, 500);
```

---

## Exemple de sortie

```text
numero: 1
titulaire: Yassine
solde: 2145.0
decouvertAutorise: 500.0
-------------------------------
numero: 2
titulaire: Mohamed
solde: 700.0
decouvertAutorise: 500.0
-------------------------------
numero: 3
titulaire: Ahmed
solde: 1500.0
decouvertAutorise: 500.0
```

---

## Concepts Java utilisés

Ce projet met en pratique plusieurs notions importantes de Java :

* programmation orientée objet ;
* encapsulation ;
* constructeurs ;
* surcharge de méthodes ;
* attributs et méthodes `static` ;
* tableaux d’objets ;
* validation des données ;
* gestion des opérations bancaires.

---

## Améliorations possibles

Pour une version plus avancée, il serait possible d’ajouter :

* une interface graphique ;
* l’utilisation de `ArrayList` au lieu d’un tableau ;
* la sauvegarde des comptes dans un fichier ou une base de données ;
* la gestion des exceptions ;
* plusieurs types de comptes (`CompteCourant`, `CompteEpargne`, etc.).

---

## Auteur

Projet réalisé par Ahmed dans le cadre d’un TP de programmation orientée objet en Java.
