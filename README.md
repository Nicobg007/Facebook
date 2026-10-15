<div align="center">

<img src="screenshots/foto-perfil.jpg" alt="Foto de Nicolás Bernal" width="150" style="border-radius:50%"/>

# 📘 Facebook Clone — Android

### Recreación de la interfaz de Facebook con **Kotlin** y **Jetpack Compose**

![Kotlin](https://img.shields.io/badge/Kotlin-2.2.10-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-Material%203-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
![Android](https://img.shields.io/badge/Android-API%2033+-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=androidstudio&logoColor=white)

</div>

---

## 👤 Autor

**Nicolás Bernal**
Desarrollador Android en formación

---

## 📖 Sobre el proyecto

Este proyecto es una recreación de la aplicación de **Facebook** para Android, construida con **Kotlin** y **Jetpack Compose**. El objetivo es practicar el desarrollo de interfaces modernas, la navegación entre pantallas y la organización de una app real.

> ⚠️ Proyecto con fines educativos. No está afiliado ni respaldado por Meta.

---

## 📱 Capturas de pantalla

<div align="center">

| Inicio | Feed | Perfil |
|:---:|:---:|:---:|
| <img src="screenshots/inicio.png" width="200"/> | <img src="screenshots/feed.png" width="200"/> | <img src="screenshots/perfil.png" width="200"/> |

</div>

---

## ✨ Funcionalidades

**Implementado**
- ✅ Proyecto base con Jetpack Compose y Material 3
- ✅ Tema personalizado (`FacebookTheme`) con colores y tipografía
- ✅ Diseño edge-to-edge

**En desarrollo / planeado**
- 🔲 Pantalla de inicio de sesión
- 🔲 Feed de publicaciones
- 🔲 Likes y comentarios
- 🔲 Perfil de usuario
- 🔲 Barra de navegación inferior

---

## 🛠️ Tecnologías

| Categoría | Tecnología |
|---|---|
| Lenguaje | Kotlin 2.2.10 |
| UI | Jetpack Compose + Material 3 |
| IDE | Android Studio |
| Build | Gradle (Kotlin DSL) + Version Catalog |
| Android Gradle Plugin | 9.3.2 |
| SDK mínimo / objetivo | API 33 (Android 13) / API 37 |

**Dependencias principales:** Compose BOM `2026.02.01`, Activity Compose, Lifecycle Runtime KTX, Core KTX.

---

## 📂 Estructura del proyecto

```
Facebook/
├── app/
│   └── src/main/
│       ├── java/me/nicolasbernal/myapplication/
│       │   ├── MainActivity.kt      # Punto de entrada de la app
│       │   └── ui/theme/            # Color.kt, Type.kt, Theme.kt
│       ├── res/                     # Recursos (strings, colores, íconos)
│       └── AndroidManifest.xml
├── gradle/
│   └── libs.versions.toml           # Catálogo de versiones
├── build.gradle.kts
└── settings.gradle.kts
```

---

## 🗺️ Roadmap

- [ ] Diseñar la pantalla de login
- [ ] Crear el feed con `LazyColumn`
- [ ] Agregar navegación con Navigation Compose
- [ ] Conectar un backend (Firebase u otro)
- [ ] Modo oscuro

---

<div align="center">

</div>