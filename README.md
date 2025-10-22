### Parcial AREP II
Para este parcial se nos pedia diseñar, construir y desplegar una aplicación web para investigar el problema matemático asignado, en mi caso me correspondio la secuencia de Pell:


1. Iniciamos primeramente creando la instancia en aws para el proxy con las respectivas reglas y funciones, creamos esa y la del servicio:

   <img width="1914" height="809" alt="image" src="https://github.com/user-attachments/assets/e6e6dfac-66b0-4415-9097-a61514a879da" />
   <img width="670" height="82" alt="image" src="https://github.com/user-attachments/assets/a23161de-7765-4a34-a17c-e8649ce77bd7" />


3. Ahora vamos a intentar conectarnos para empezar la configuracion del proxy, usamos el siguiente comando para conectar la llave y nos conectamos a la instancia: 
-  **ssh -i "parcial.pem" ec2-user@54.204.89.244**
   <img width="945" height="349" alt="image" src="https://github.com/user-attachments/assets/a2dcbad0-e4fe-486c-9bac-ca785c9dd597" />

3. Intentamos iniciar con las configuraciones para poner a funcionar el proxy en este caso
   
   <img width="1080" height="549" alt="image" src="https://github.com/user-attachments/assets/4dd4aa4c-4f70-44de-9a2c-491bcb44e9bd" />

5. Ahora seguimos con la funcion de Pell, en este caso se creo una clase llamada **PellSequence.java** para cumplir con la funcion correspondiente:
 - La idea es: Para calcular la secuencia de Pell hasta un índice dado: pellseq(n) retornamos un JSON con los términos desde P(0) hasta P(n). (Recibe solo enteros no negativos).
   
   <img width="485" height="555" alt="image" src="https://github.com/user-attachments/assets/1d27da97-6e92-49bd-ada6-6fd9dfbf9f06" />
   
- Funciona usando recurrencia, acumulando cada término desde 0 hasta n y asi consecutivamente, tambien cuenta con formato JSON para la salida
- Luego tenemos otra clase llamada **PellHttp.java** la cual va a ser la encargada de las peticiones GET y la logica en este caso, contara tambien con la salida en JSON:

   <img width="630" height="514" alt="image" src="https://github.com/user-attachments/assets/9ca3301c-4938-4761-a393-8412dfafc280" />
   <img width="538" height="137" alt="image" src="https://github.com/user-attachments/assets/e036be78-38b6-4381-bd88-98070ceb454b" />
