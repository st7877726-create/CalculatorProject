# CalculatorProject

Консольний калькулятор на Java з підтримкою базових арифметичних операцій та автоматичними тестами.

## Можливості

- Додавання, віднімання, множення та ділення двох чисел типу `double`.
- Перевірка вхідних даних на `NaN` та нескінченність.
- Обробка ділення на нуль через `ArithmeticException`.
- Власне перевірюване виключення `InvalidInputException`.
- Інтерактивний консольний інтерфейс на базі `Scanner` з повідомленнями українською мовою.

## Технології

- **Java 21**
- **Maven** — збирання та керування залежностями
- **Lombok** — генерація конструкторів (`@NoArgsConstructor`) і налаштований annotation processing
- **JUnit 5** — модульні тести
- **Maven Surefire Plugin 3.5.2** — запуск тестів через Maven

## Структура проєкту

```
src/
├── main/java/
│   ├── Calculator.java
│   ├── InvalidInputException.java
│   └── Main.java
└── test/java/
    └── CalculatorTest.java
pom.xml
```

## Запуск тестів

```bash
mvn clean test
```

## Запуск застосунку

```bash
mvn clean compile
java -cp target/classes Main
```

Або запустіть клас `Main` з вашої IDE (IntelliJ IDEA, Eclipse тощо).
