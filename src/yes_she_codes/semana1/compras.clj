(ns yes-she-codes.semana1.compras
  (:require [yes-she-codes.semana1.db :as y.db]))

(defn nova-compra
  "Cadastra uma nova compra"
  [dados-compra]
  (if-let [[data valor estabelecimento categoria cartao] dados-compra]
    {:data            data
     :valor           valor
     :estabelecimento estabelecimento
     :categoria       categoria
     :cartao          cartao}
    (println "ERRO - Dados de compra invalidos")))

(defn lista-compra [lista-dados-compra]
  (mapv nova-compra lista-dados-compra))
