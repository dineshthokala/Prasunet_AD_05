# QR Scanner Android App

This is an Android application for scanning QR codes, built with Kotlin and Jetpack Compose. The app provides a simple and modern interface for scanning and managing QR codes.

## Features
- Scan QR codes using the device camera
- View scan history
- Modern UI with Jetpack Compose
- Modular architecture with MVVM pattern

## Project Structure
- `app/` - Main application module
  - `src/main/java/com/scan/qrscanner/` - Source code
    - `data/` - Data layer (repository, datasource, models)
    - `model/` - Data models
    - `navigation/` - Navigation components
    - `scanner/` - Scanner logic and ViewModel
    - `ui/` - UI components and themes
  - `res/` - Resources (drawables, layouts, values)
- `build.gradle`, `settings.gradle` - Project configuration

## Getting Started

### Prerequisites
- Android Studio (latest version recommended)
- Android SDK 24 or higher
- Gradle

### Build & Run
1. Clone the repository:
   ```sh
   git clone <repo-url>
   ```
2. Open the project in Android Studio.
3. Sync Gradle and build the project.
4. Run the app on an emulator or physical device.

### Gradle Commands
- Build the project:
  ```sh
  ./gradlew build
  ```
- Run tests:
  ```sh
  ./gradlew test
  ```

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

## Screenshots
![App Screenshot](images/screen.png)

## Contact
For questions or support, please open an issue or contact the maintainer.
