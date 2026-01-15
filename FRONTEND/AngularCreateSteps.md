# Crear Angular desde cero

Comandos:  Ctrl + Shift + V

## NVM (Node Version Manager)

Verificar la version
```
nvm --version

1.1.12
```

Mostrar las lista de las versiones de node instaladas en tu maquina
```
nvm list

24.0.0
```

Instalat una version de node
```
nvm install 22.12.0
```

Usar la version existente o instalada
```
nvm use 22.12.0
```

## Node.js (viene de la palabra nodos)

Verificar la version de Node.js
```
node --version

v22.12.0
```

## NPM (Node package Manager)

Verifica la version de Npm
```
npm --version

10.9.0
```

## ANGULAR

Instalar Angular de forma global
```
npm install -g @angular/cli@latest
```

Validar la version de Angular instalada
```
ng version

Angular CLI: 20.1.3
Node: 22.12.0
Package Manager: npm 10.9.0
OS: win32 x64
```

Crear un nuevo proyecto de angular
```
ng new AutonomaDemo --minimal=false
```

Aceptar con las siguiente opciones la crear proyecto angular
```
Do you want to create a 'zoneless' application without zone.js (Developer Preview)? (y/N) N
Sass (SCSS)     [ https://sass-lang.com/documentation/syntax#scss                ]
Do you want to enable Server-Side Rendering (SSR) and Static Site Generation (SSG/Prerendering)? (y/N) N
```

Ubicarse con el terminal dentro del proyecto de angular creado
```
cd AutonomaDemo
```

Ejecutar el proyecto de angular de forma local
```
npm run start
```

### En el proyecto de angular

- Si aparece como app.ts renombrar para mejro entendiemiento como app.component.ts y asi el resto

### Crear un nuevo componente

```
ng g c users
```

## Estructura de un proyecto angular version 20

```
mi-app/
├── e2e/                              # Tests end‑to‑end
│   └── src/
│       └── support/                  # Helpers para e2e
├── node_modules/
├── src/
│   ├── app/
│   │   ├── components/               # Componentes standalone reutilizables
│   │   │   ├── header/
│   │   │   │   ├── header.component.ts
│   │   │   │   ├── header.component.html
│   │   │   │   └── header.component.scss
│   │   │   └── ...                   # Otros componentes
│   │   ├── pages/                    # “Páginas” de ruta (vistas principales)
│   │   │   ├── home/
│   │   │   │   ├── home.component.ts
│   │   │   │   ├── home.component.html
│   │   │   │   └── home.component.scss
│   │   ├── services/                 # Servicios (API, estado, utilidades)
│   │   │   └── api.service.ts
│   │   ├── models/                   # Interfaces y tipos
│   │   │   └── user.model.ts
│   │   ├── util/                     # Pipes, directivas, guards, helpers
│   │   │   └── date-format.pipe.ts
│   │   ├── app.component.ts          # Componente raíz standalone
│   │   ├── app.component.html
│   │   |── app.component.scss
|   |   |__ app.config.ts
|   |   |__ app.router.ts
│   ├── assets/
│   │   ├── images/
│   │   └── styles/                   # SCSS global (variables, mixins)
│   │       ├── _variables.scss
│   │       ├── _mixins.scss
│   │       └── styles.scss
│   ├── environments/                 # Configuración por entorno
│   │   ├── environment.ts
│   │   └── environment.prod.ts
│   ├── index.html
│   ├── main.ts                       # bootstrapApplication + providers
│   ├── polyfills.ts
│   ├── styles.scss                   # importa assets/styles.scss
│   └── test.ts                       # configuración de tests unitarios
├── .editorconfig
├── .gitignore
├── angular.json                      # Configuración de CLI, build, serve…
├── package.json
├── tsconfig.json
├── tsconfig.app.json
├── tsconfig.spec.json
└── karma.conf.js
```

## Bbootstrap

Instalar boostrap
```
npm install bootstrap
```

Configurar en angular.json
architect → build → options → styles añade al principio:

```
"styles": [
  "node_modules/bootstrap/dist/css/bootstrap.min.css",
  "src/styles.scss"
],

"scripts": [
  "node_modules/bootstrap/dist/js/bootstrap.bundle.min.js"
]
```



