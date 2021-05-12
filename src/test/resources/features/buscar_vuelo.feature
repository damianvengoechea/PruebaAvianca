#language: es

Característica: Buscar vuelo en la pagina de avianca
  yo como usuario
  deseo realizar la busqueda de un vuelo de ida
  para reservarlo

  Esquema del escenario: Realizar busqueda de vuelo de ida
    Dado que Damian esta en la pagina de avianca
    Cuando realiza la busqueda de la reserva del vuelo de ida de <origen> a <destino>
    Entonces podra visualizar la tarifa del vuelo

    Ejemplos:
      | origen   | destino |
      | Medellin | Bogota  |