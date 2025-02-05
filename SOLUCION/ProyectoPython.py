import random

def barrios():
    return [
        "Agencia Banco de Loja", "Av. 8 de Diciembre", "Av. Eloy Alfaro", "Av. Kigman",
        "Cabo Minacho", "Calasanz", "Casa de Enfermeros Terminales", "Ciudad Alegría",
        "Clínica Natali", "Colegio Beatriz Cueva de Ayora", "Coliseo Ciudad de Loja",
        "Estadio", "Hipervalle", "Hotel La Castellana", "Iglesia Verbo", "José A. Eguiguren",
        "La Salle", "Las Pitas", "Lauro Guerrero", "Los Cocos", "Mercadillo", "Migas",
        "Parque Infantil", "Parque Polideportivo", "Parqueadero Polideportivo", "Pradera",
        "Predesur", "Puerta de la Ciudad", "Redondel del Soldado", "Rosales",
        "Sauces Norte", "Tame", "Tebaida Baja", "Terminal Terrestre", "Tnte. Geovany Calle",
        "Urna", "Zona Militar"
    ]

def generar_paradas(barrios):
    paradas = {barrio: [] for barrio in barrios}
    
    for barrio in barrios:
        while len(paradas[barrio]) < 10:
            parada = random.choice(barrios)
            if parada not in paradas[barrio] and parada != barrio:
                paradas[barrio].append(parada)
    
    return paradas

def generar_personas():
    return {barrio: [random.randint(0, 50) for _ in range(10)] for barrio in barrios()}

def menu():
    barrios_lista = barrios()
    paradas = generar_paradas(barrios_lista)
    personas = generar_personas()
    
    horarios = ["06:30", "07:30", "08:00", "09:00", "09:30", "12:30", "13:00", "16:30", "18:00", "20:00"]

    while True:
        print("\nLista de barrios:")
        for i, barrio in enumerate(barrios_lista, 1):
            print(f"{i}. {barrio}")

        try:
            opcion = int(input("Seleccione un barrio (número): ")) - 1
            if opcion < 0 or opcion >= len(barrios_lista):
                print("Opción inválida, intente de nuevo.")
                continue

            barrio_seleccionado = barrios_lista[opcion]
            print(f"\nBarrio seleccionado: {barrio_seleccionado}")
            
            print("\n¿Qué desea ver?")
            print("1. Rutas de entrada")
            print("2. Rutas de salida")
            opcion_ruta = int(input("Seleccione una opción: "))

            if opcion_ruta == 1:
                print(f"\nLas rutas de entrada para {barrio_seleccionado} son:")
                for i, parada in enumerate(paradas[barrio_seleccionado]):
                    print(f"{i+1}. {parada}, UTPL {horarios[i]} - Personas: {personas[barrio_seleccionado][i]}")

            elif opcion_ruta == 2:
                print(f"\nLas rutas de salida para {barrio_seleccionado} son:")
                for i, parada in enumerate(paradas[barrio_seleccionado]):
                    print(f"{i+1}. UTPL -> {parada} - {horarios[i]} - Personas: {personas[barrio_seleccionado][i]}")

            else:
                print("Opción inválida.")

        except ValueError:
            print("Ingrese un número válido.")

        continuar = input("\n¿Desea buscar otro barrio? (s/n): ").strip().lower()
        if continuar != 's':
            break

if __name__ == "__main__":
    menu()
