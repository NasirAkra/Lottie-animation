# Lottie Animations

Lottie is a library for rendering high-quality, scalable animations on multiple platforms, including Android, iOS, and the web. These animations are exported as JSON files from Adobe After Effects using the Bodymovin plugin. With Lottie, you can easily integrate lightweight and interactive animations into your project.

## Features
- **Cross-Platform Support**: Works seamlessly on Android, iOS, and web.
- **Scalable and Lightweight**: Vector-based animations that maintain high quality and small file sizes.
- **Interactive Animations**: Respond to user interactions like clicks, scrolls, and gestures.
- **Customizable**: Modify colors, speeds, and other properties programmatically.

## Prerequisites
- Ensure you have [Android Studio](https://developer.android.com/studio) installed.
- Use Kotlin or Java for Android development.

## Installation

1. Add the Lottie dependency to your `build.gradle` file:

   ```gradle
   implementation 'com.airbnb.android:lottie:6.0.0'
   ```

2. Sync your project to download the dependency.

## Usage

### Step 1: Add a Lottie Animation to Your Project

- **Import Animation File**: Place your `.json` animation file in the `res/raw` directory of your project.

### Step 2: Add the Lottie Animation View to Your Layout

Add the following to your XML layout file:

```xml
<com.airbnb.lottie.LottieAnimationView
    android:id="@+id/lottieView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:lottie_rawRes="@raw/animation_file"  
    app:lottie_autoPlay="true"
    app:lottie_loop="true" />
```

### Step 3: Control Animations Programmatically

```kotlin
import com.airbnb.lottie.LottieAnimationView

val lottieView = findViewById<LottieAnimationView>(R.id.lottieView)

// Set animation file dynamically
lottieView.setAnimation("animation_file.json")

// Play animation
lottieView.playAnimation()

// Loop animation
lottieView.repeatCount = LottieDrawable.INFINITE
```

### Step 4: Interactivity

You can make the animation interactive by controlling its progress based on user actions:

```kotlin
lottieView.progress = 0.5f  // Set animation to 50% progress
```

## Resources
- [Official Lottie Documentation](http://airbnb.io/lottie/)
- [Bodymovin Plugin for After Effects](https://aescripts.com/bodymovin/)

## Contributing

We welcome contributions! If you'd like to contribute, please follow these steps:
1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m "Description of changes"`).
4. Push to the branch (`git push origin feature-name`).
5. Create a Pull Request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
