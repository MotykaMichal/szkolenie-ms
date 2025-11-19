Mikroserwisy: Jesli robiac na klastrze
To samo to ze mam serwis i skalowanie aplikacji zastępuje discovery server (eureka) poniewaz serwis ma informacje na temat wszystkich podów.
 
Zeby zrobic cos ala gateway (przy strzale do aplikacji a, do aplikacji b wystarczy strzealc na 1 endpoint - oczywiscie te apliakcje moga miec po np. 10 podow) wystarczy zrobic ingress + load balancer dla ingress. Ale mozna oczywiscie tez uzywac gateway ze spring cloud jesli to java.
 