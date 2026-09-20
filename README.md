# Proyecto de Arquitectura de Microservicios

**Estudiante:** Omar Antonio Mosquera Palacios  
**Institución:** Corporación Universitaria Remington (Uniremington)  
**Asignatura:** Lenguaje de Programación Avanzado 2  
**Fecha:** 20 de septiembre de 2026

## Descripción
Proyecto académico desarrollado con Java 17 y Spring Boot 3.2.5 para demostrar la comunicación REST entre dos microservicios independientes.

- `usuarios-service`: puerto 8081.
- `pedidos-service`: puerto 8082.
- `pedidos-service` consulta a `usuarios-service` mediante HTTP REST.

## Ejecución en Visual Studio Code
1. Abrir la carpeta principal en VS Code.
2. Esperar a que el soporte de Java/Maven cargue las dependencias.
3. Ejecutar `UsuariosServiceApplication.java`.
4. Ejecutar `PedidosServiceApplication.java`.
5. Mantener ambos servicios activos.

## Pruebas
- `GET http://localhost:8081/usuarios`
- `GET http://localhost:8081/usuarios/1`
- `GET http://localhost:8082/pedidos`
- `GET http://localhost:8082/pedidos/1`

La consulta de `/pedidos/1` evidencia la comunicación entre servicios.

## Entregables
El PDF, diagrama y guion se encuentran en `docs/`.
