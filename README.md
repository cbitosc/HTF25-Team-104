# 🍳 SnapChef - AI-Powered Cooking Assistant

<div align="center">

![SnapChef Banner](https://img.shields.io/badge/SnapChef-AI%20Cooking%20Assistant-orange?style=for-the-badge&logo=android)

[![Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://android.com)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-purple.svg)](https://kotlinlang.org)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

**Transform your ingredients into delicious meals with AI-powered recipe suggestions!**

[Features](#-features) • [Installation](#-installation) • [Usage](#-usage) • [Tech Stack](#-tech-stack) • [Contributing](#-contributing)

</div>

---

## 📱 About

**SnapChef** is an innovative Android application that revolutionizes home cooking by using AI to help you discover recipes based on the ingredients you have. Simply snap a photo of your ingredients or browse our collection, and let our AI-powered assistant guide you through creating amazing dishes.

### 🎯 Problem Statement

Ever opened your fridge and wondered what you can cook with the ingredients you have? SnapChef solves this age-old problem by:
- Identifying ingredients from photos
- Suggesting personalized recipes
- Reducing food waste
- Making cooking accessible to everyone

---

## ✨ Features

### 🔍 Core Features
- **📸 Snap & Identify**: Take photos of ingredients and get instant recognition
- **🤖 AI Recipe Suggestions**: Get personalized recipe recommendations based on available ingredients
- **👨‍🍳 Step-by-Step Guidance**: Follow easy-to-understand cooking instructions
- **🌐 Web-Based Interface**: Seamless experience powered by Progressive Web App technology
- **📱 Native Android Experience**: Smooth performance with WebView integration

### 🎨 User Experience
- Clean and intuitive interface
- Fast loading times
- Offline capability (coming soon)
- Multi-language support (coming soon)

---

## 🚀 Installation

### Prerequisites
- Android Studio Arctic Fox or later
- Android SDK 24 (Android 7.0) or higher
- Kotlin 1.9.20 or later
- Internet connection for first-time setup

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/MariamFirdous/HTF25-Team-104.git
   cd HTF25-Team-104
   ```

2. **Open in Android Studio**
    - Launch Android Studio
    - Click `File > Open`
    - Select the cloned project directory
    - Wait for Gradle sync to complete

3. **Build the project**
   ```bash
   ./gradlew build
   ```

4. **Run on device/emulator**
    - Connect your Android device via USB (with USB debugging enabled)
    - Or start an Android emulator
    - Click the `Run` button (green triangle) in Android Studio

---

## 📖 Usage

### Getting Started

1. **Launch SnapChef**
    - Open the app on your Android device
    - The web interface will load automatically

2. **Snap Your Ingredients**
    - Tap the camera icon
    - Take a photo of your ingredients
    - Or upload from gallery

3. **Get Recipe Suggestions**
    - AI analyzes your ingredients
    - Browse recommended recipes
    - Select your preferred dish

4. **Start Cooking**
    - Follow step-by-step instructions
    - Check off completed steps
    - Enjoy your meal!

---

## 🛠 Tech Stack

### Android Application
- **Language**: Kotlin
- **Min SDK**: 26 (Android 7.0 Nougat)
- **Target SDK**: 34 (Android 14)
- **Architecture**: WebView-based hybrid app

### Dependencies
```gradle
- androidx.core:core-ktx:1.12.0
- androidx.appcompat:appcompat:1.6.1
- com.google.android.material:material:1.11.0
- androidx.constraintlayout:constraintlayout:2.1.4
```

### Web Platform
- **Framework**: React/Progressive Web App
- **Hosting**: Lovable.app
- **URL**: [https://conjure-kitchen-94313-92699-83411-37383.lovable.app](https://conjure-kitchen-94313-92699-83411-37383.lovable.app)

---

## 📁 Project Structure

```
SnapChef/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/snapchef/
│   │   │   │   └── MainActivity.kt          # Main activity with WebView
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml    # Main layout
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml          # String resources
│   │   │   │   │   ├── colors.xml           # Color palette
│   │   │   │   │   └── themes.xml           # App themes
│   │   │   │   └── mipmap/                  # App icons
│   │   │   └── AndroidManifest.xml          # App configuration
│   │   └── build.gradle                      # App-level build config
│   └── proguard-rules.pro
├── build.gradle                              # Project-level build config
├── settings.gradle                           # Project settings
├── .gitignore
└── README.md
```

---


## 🔧 Configuration

### Changing the Web URL

To point to a different web interface, edit `MainActivity.kt`:

```kotlin
webView.loadUrl("YOUR_NEW_URL_HERE")
```

### Customizing App Theme

Edit `res/values/themes.xml` to change colors and styles:

```xml
<item name="colorPrimary">@color/your_color</item>
```

---

## 🤝 Contributing

We welcome contributions! Here's how you can help:

### How to Contribute

1. **Fork the repository**
2. **Create a feature branch**
   ```bash
   git checkout -b feature/amazing-feature
   ```
3. **Commit your changes**
   ```bash
   git commit -m "Add some amazing feature"
   ```
4. **Push to the branch**
   ```bash
   git push origin feature/amazing-feature
   ```
5. **Open a Pull Request**

### Contribution Guidelines
- Follow Kotlin coding conventions
- Write meaningful commit messages
- Update documentation for new features
- Test thoroughly before submitting PR

---

## 🐛 Known Issues

- [ ] Offline mode not yet implemented
- [ ] Camera permission handling needs improvement
- [ ] Back button behavior in certain scenarios

See the [Issues](https://github.com/MariamFirdous/HTF25-Team-104/issues) page for a full list.

---

## 📋 Roadmap

### Version 1.1
- [ ] Offline recipe storage
- [ ] Favorites and bookmarks
- [ ] Shopping list generator
- [ ] Nutrition information

### Version 1.2
- [ ] Dark mode support
- [ ] Multiple language support
- [ ] Voice-guided cooking
- [ ] Social sharing features

### Version 2.0
- [ ] Native camera integration
- [ ] Custom recipe creation
- [ ] Meal planning calendar
- [ ] Community recipe sharing

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2025 SnapChef Team

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```

---

## 👥 Team

### HTF25 - Team 104

- **Mariam Firdous** - *Developer* - [@MariamFirdous](https://github.com/MariamFirdous)
- **Shaik Heeba Hayat** - *Developer* 
- **Maliha Mubeen** - *Developer*

---


## 📞 Contact & Support

- **GitHub Issues**: [Report a bug](https://github.com/MariamFirdous/HTF25-Team-104/issues)
- **Email**: mariamfirdous17@gmail.com
- **Website**: [SnapChef Web App](https://conjure-kitchen-94313-92699-83411-37383.lovable.app)

---

## 📊 Project Stats

![GitHub repo size](https://img.shields.io/github/repo-size/MariamFirdous/HTF25-Team-104)
![GitHub contributors](https://img.shields.io/github/contributors/MariamFirdous/HTF25-Team-104)
![GitHub stars](https://img.shields.io/github/stars/MariamFirdous/HTF25-Team-104?style=social)
![GitHub forks](https://img.shields.io/github/forks/MariamFirdous/HTF25-Team-104?style=social)

---

<div align="center">

**Made with ❤️ by Team 104**

⭐ Star us on GitHub if you find SnapChef helpful!

</div>
