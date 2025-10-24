# Functional Programming i Java

Dette projekt er en del af 3. semester Datamatiker uddannelsen på KEA og fokuserer på funktionel programmering i Java.

## Læringsmål

- **Funktionelle interfaces**: Forstå og implementere custom funktionelle interfaces (`@FunctionalInterface`)
- **Lambda-udtryk**: Skrive og anvende lambda-expressions 
- **Method references**: Bruge method references som alternativ til lambda-expressions
- **Higher-order functions**: Implementere funktioner der tager andre funktioner som parametre
- **Stream API**: Arbejde med Java's Stream API til databehandling (`map()`, `filter()`, `reduce()`)
- **Funktionel databehandling**: Anvende streams til transformation og filtrering af data

## Nøglekonceper

- **Custom Functional Interfaces**: Oprettelse af interfaces som `OneArgument`, `TwoArgument`, etc.
- **Lambda Expressions**: `(x, y) -> x + y`
- **Method References**: `System.out::println`
- **Stream Processing**: Arbejde med `Stream.generate()`, `map()`, `filter()`, `limit()`
- **Higher-Order Functions**: Funktioner der modtager andre funktioner som parametre

### Introduktion (`functionalprogrammingintro/`)
- Grundlæggende lambda og interface brug
- Valutaomregning med funktioner
- Stream generering og manipulation
- Dato-behandling med streams

### Øvelser (`functionalprogrammingexercises/`)
- BiFunction implementation
- Custom functional interface brug  
- Stream-opgaver med stigende kompleksitet

