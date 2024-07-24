# UNSOLID

## Integrantes:
    - David Heredia
    - Andres Afanador
    - Joseph Camelo
    - Katerine Vasquez
    - Santiago Ruiz

## Principios Solid violados:

    1. En la clase 'EmployeeManager y EmployeeOperations' se viola el principio de single responsibilty debido a que esta clase debe tener 
    como unica responsabilidad la gestion de empleados mas no la de calcular salarios o guardar archivos.

    Solucion: 
    Se debe dividir estas responsabilidades en clases separadas:
        1. Modificar la interfaz EmployeeOperations eliminando los metodos calculateSalary y saveToFile
        ademas de crear nuevas interfaces para calculateSalary y saveToFile.
        2.Modificar la clase EmployeeManager para que solo agregue y elimine empleados.
        3.Agregar una nueva clase (FileManager) 
        4.Modificar la clase SalaryCalculator para que gestione exclusivamente los salarios sin depender 
        de EmployeeManager.

    2. En la clase 'EmployeeManager y EmployeeOperations' se viola el principio open/close al no estar abiertas a extensión.
        Cualquier nueva funcionalidad requiere modificar ambas clases.

    Solución: Crear nuevas interfaces específicas para cada responsabilidad. Esto permite agregar nuevas funcionalidades sin modificar las interfaces o clases existentes.
        1. Dividir la interfaz 'EmployeeOperations' en interfaces más pequeñas.
        2. Implementar las nuevas interfaces en clases separadas que manejen cada responsabilidad por separado.

    
    3. La clase ReportGenerator viola el principio de open/closed al no estar abierto a extension dado el caso que 
    se quiere generar un nuevo tipo de informe.

    Solucion: Se modificara la clase ReportGenerator para ser un interfaz la cual tendra un metodo que generara los 
    reportes en base al tipo de reporte especificado, estos tipos de reportes se definiran en clases individuales.

    4. Los metodos (calculateSalary, saveToFile) estan violando el principio de interface segregation ya que son metodos
    no relacionados con el empleado.

    Solucion: Se dividio en dos nuevas interfaces IFileManager  Interface segregation

    5. En la clase PartTimeEmployee se viola el principio de Liskov al no implementar lo que herada del padre.

    Solucion: Se remueve el metodo heredado y se deja la clase lista para futuras funcionalidades.

    6. 6. La clase 'SalaryCalculator' viola el principio de inversión de dependencias, al depender directamente de 'EmployeeManager', una implementación concreta.  
    
    Solución: 
        1. Crear una interfaz para el cálculo de salarios.
        2.Inyectar al método calculateSalary el Empleado al que queremos realizar la operación


    
