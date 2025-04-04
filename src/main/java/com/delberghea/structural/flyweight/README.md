
# Observations sur l'implémentation du Design Pattern Flyweight en Java

## 📝 Contexte

Ce projet mesure l'impact du design pattern **Flyweight** sur la consommation mémoire en Java. L'objectif est de comparer la consommation mémoire de différentes implémentations (avec et sans Flyweight) pour la création de **1 million d'arbres**.

### 🧑‍💻 Scénarios testés :
1. **Sans Flyweight** : Chaque arbre possède des propriétés indépendantes (`name`, `color`, `texture`).
2. **Flyweight Java natif** : Utilisation de l'internement des `String` et d'une gestion optimisée des champs pour réduire l'empreinte mémoire.
3. **Flyweight manuel** : Implémentation manuelle du pattern Flyweight en utilisant un **réservoir** (pool) d'objets partagés pour les valeurs communes.

---

## 🧮 Résultats des tests

### 1. **Sans Flyweight** :
- **Mémoire utilisée** : **220 000 Ko**

  Cette version crée un objet `Tree` complet pour chaque arbre, avec des propriétés (`name`, `color`, `texture`, `x`, `y`) toutes indépendantes. Cela entraîne une consommation mémoire élevée, car chaque arbre est un objet à part entière.

---

### 2. **Flyweight Java natif** :
- **Mémoire utilisée** : **49 000 Ko**

  Dans cette version, Java utilise l'internement des chaînes de caractères (`String`), ce qui permet de partager des instances de `String` entre les objets et d'optimiser ainsi l'utilisation de la mémoire.

---

### 3. **Flyweight manuel** :
- **Mémoire utilisée** : **41 000 Ko**

  Cette version implémente manuellement le design pattern Flyweight. Elle utilise un **pool de Flyweights** pour les propriétés communes des arbres (par exemple `name`, `color`, `texture`). Cela permet de réduire encore davantage la consommation mémoire en réutilisant des objets partagés.

---

## 📊 Observations

- **Flyweight Java natif** offre une réduction de **78%** de la mémoire par rapport à la version sans Flyweight.
- **Flyweight manuel** est encore plus efficace, réduisant la mémoire de **81%** par rapport à la version sans Flyweight.
- L'optimisation manuelle du Flyweight est donc plus efficace que la gestion automatique des chaînes de caractères, notamment grâce au contrôle fin du stockage des propriétés communes.

---

## 🔧 Code utilisé pour les tests

Le code source pour ces tests est basé sur un modèle de simulation de forêt d'arbres avec différentes implémentations de Flyweight. Vous pouvez consulter les différentes versions du code pour voir les comparaisons détaillées.

---

## 🚀 Conclusion

Le design pattern **Flyweight** permet d'optimiser l'utilisation mémoire en **partageant des objets communs** au lieu de les dupliquer. Dans ce cas, **Flyweight manuel** offre la meilleure réduction de la consommation mémoire, surpassant même l'optimisation automatique des chaînes de caractères de Java.
