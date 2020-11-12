# taller_SOLID - Jorge Villalta


##Principio Liskov-Sustitution:
###Dado que las clases hijas Helado y Patel se parecen tanto deberían poder comportarse en todo momento como una clase padre.

##Principio Interface-Segregation:
###OperacionesAderezo es una clase prescindible con métodos muy concretos que podrían implementarse en la propia clase Postre.

##Principio Single-Responsibility:
###Las clase Postre se estaba encargando de más de una responsabilidad, cuando lo ideal seria que la clase Postre delegue la responsabilidad de calcular el precio final a otra clase.

##Principio Dependency-Inversion:
###La implementación original de aderezo es demasiado estática, al hacerla abstracta se evita la dependencia entre dos clases demasiado concretas.

##Principio Open-Closed:
###Debido a que se violaban otros principios la mayor parte del codigo rompia el principio de Open-Closes ya que al haber clases muy concretas y dependientes para agregar nueva funcionalidad era necesario editar codigo en vez de agregar nuevo codigo.
