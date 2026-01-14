CA S1.05: Java Utils - Nivel 1

**Descripció**: Este proyecto consiste en el desarrollo de una serie de utilidades en Java para la gestión del sistema de archivos. El objetivo es dominar la navegación por directorios, el tratamiento recursivo de carpetas, la lectura/escritura de archivos de texto y la persistencia de datos mediante la serialización de objetos.

---

## 📌 Enunciado del ejercicio

El Nivel 1 se divide en 5 funcionalidades progresivas:
1. **Ejercicio 1**: Listado alfabético de un directorio recibido por parámetro.
2. **Ejercicio 2**: Listado recursivo en forma de árbol con detalles (D/F) y fecha de modificación.
3. **Ejercicio 3**: Exportación del listado del árbol a un archivo `.txt`.
4. **Ejercicio 4**: Lectura y muestra por consola de cualquier archivo `.txt`.
5. **Ejercicio 5**: Serialización y deserialización de un objeto `User` a un archivo `.ser`.

### Nivel 2: Parametrización Externa
1. **Ejercicio 1**: Modificación del listado recursivo para que la configuración (directorio de entrada y archivo de salida) se lea desde un archivo `config.properties` en lugar de argumentos de consola.

---

## ✨ Funcionalidades
- **Navegación Recursiva**: Capacidad para recorrer estructuras de carpetas de cualquier profundidad.
- **Ordenación Alfabética**: Los resultados se muestran siempre ordenados independientemente del sistema operativo.
- **Persistencia de Datos**: Generación de informes en texto y guardado de estado de objetos en binario.
- **Portabilidad**: Uso de rutas relativas para asegurar el funcionamiento en cualquier entorno.

---

## 🛠 Tecnologies
- **Backend**: Java 21+ (Java SE)
- **Librerías utilizadas**: `java.io`, `java.util`, `java.text`

---

## 🚀 Instalación y Ejecución

### 1. Clonar el repositorio
```bash
git clone [https://github.com/tu-usuario/TASCA05.git](https://github.com/tu-usuario/TASCA05.git)
cd TASCA05

## How to run the Code

To run this project from the command line, you have to follow the nexts steps:

1. Navigate to the project root directory ('C:\Users\adrii\IdeaProjects\Tasca-S1.05-Java-Utils')
2. Compile the code:  Put this command in terminal --> javac nivell1/exercici1/Main.java
3. Run the code: You have to put this command --> java nivell1.exercici1.Main "C:\Users\adrii\IdeaProjects\Tasca-S1.05-Java-Utils"
