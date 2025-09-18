Proyecto Calculadora

Autores:
- Addel José Perez Ospino - 01xhero-HeroplayGT
- Melany Marina Olivera Atencio
- Juan Pablo Moreno Baquero

## Entregables
- Código fuente Java (clase `Calculadora` y pruebas en `src/test/java`).
- `pom.xml` con JUnit Jupiter y plugin Surefire.
- Workflow de GitHub Actions: `.github/workflows/ci.yml`.
- `Dockerfile.act` para correr el workflow localmente con `act`.
- `.dockerignore` para excluir artefactos locales.

## Ejecutar CI localmente con act
1. Instala `act` y Docker en tu máquina.
2. (Opcional) Construye la imagen para `act` localmente:

```powershell
docker build -t calculadora-act -f Dockerfile.act .
```

3. Ejecuta el workflow usando `act` y la imagen creada:

```powershell
act -j build -P ubuntu-latest=calculadora-act:latest
```

Si no pasas `-P`, `act` usará una imagen por defecto; la opción `-P` mapea el runner a una imagen local.

### Resultado esperado
- Ejecución exitosa: `BUILD SUCCESS` y `Tests run: 6, Failures: 0`.
- Ejecución fallida (simulación): altera temporalmente un `assertEquals` en `CalculadoraTest.java` y vuelve a ejecutar `act`; el workflow debe fallar y mostrar el stacktrace de Maven.

## Notas
- El workflow en `.github/workflows/ci.yml` está configurado para usar JDK 21 (Temurin) y cache de Maven.
- `Dockerfile.act` ejecuta `mvn test` durante la construcción, por lo que la `docker build` fallará si los tests fallan.

## Resultados de pruebas (local con Docker)

Resumen:
- Tests ejecutados: 6
- Fallos: 0
- Estado: BUILD SUCCESS

Fragmento del log (ci-success.log):

```
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

El archivo completo de salida local se encuentra en `ci-success.log`.

## Evidencia de fallo (simulación)

Se introdujo temporalmente un fallo en `CalculadoraTest.testAddition` para verificar el comportamiento del CI. Resumen:
- Tests ejecutados: 6
- Fallos: 1 (testAddition)
- Estado: BUILD FAILURE

Fragmento del log (ci-failure.log):

```
[ERROR] com.mycompany.calculadora.CalculadoraTest.testAddition -- Time elapsed: 0.014 s <<< FAILURE!
org.opentest4j.AssertionFailedError: 5 + 3 debe ser 9 (fallo intencional) ==> expected: <9.0> but was: <8.0>
[ERROR] Tests run: 6, Failures: 1, Errors: 0, Skipped: 0
[INFO] BUILD FAILURE
```

El archivo completo de salida local se encuentra en `ci-failure.log`.
