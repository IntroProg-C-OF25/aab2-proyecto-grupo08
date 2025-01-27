def main():
    import sys

    def mostrar_barrios():
        paradas = barrios_salida()
        for idx, parada in enumerate(paradas, start=1):
            print(f"{idx}) {parada[0]}")

    def mostrar_rutas_entrada():
        rutas = barrios_entrada()
        for idx, ruta in enumerate(rutas, start=1):
            print(f"{idx}) {ruta[1]} horario {ruta[2]}")

    def mostrar_rutas_salida():
        rutas = barrios_salida()
        for idx, ruta in enumerate(rutas, start=1):
            print(f"{idx}) {ruta[1]} {ruta[2]}")

    def barrios_entrada():
        return [
            ["Parque Infantil", "Parque Infantil, Migas, La Salle, Colegio Beatriz Cueva de Ayora, Urna, Universidad UTPL", "6:30 (L-M-M-J-V)"],
            ["Casa de Enfermeros Terminales", "Casa de Enfermeros Terminales, Redondel del Soldado, Iglesia Verbo, Cabo Minacho, Parque Infantil, Urna, Universidad UTPL, Parque Polideportivo", "6:30 (L-M-M-J-V)"],
            ["Ciudad Alegría", "Ciudad Alegría, Av. Eloy Alfaro, Tnte. Geovany Calle, Los Cocos, Tebaida Baja, Puerta de la Ciudad, Urna, Universidad UTPL, Parqueadero Polideportivo", "7:25 (L-M-M-J-V)"],
            ["Tebaida Baja", "Tebaida Baja, Coliseo Ciudad de Loja, Hotel La Castellana, Agencia Banco de Loja, Puerta de la Ciudad, Urna, Universidad UTPL, Parqueadero Polideportivo", "6:30 (L-M-M-J-V)"],
            ["Zona Militar", "Zona Militar, Urna, UTPL", "6:20 (L-M-M-J-V)"],
            ["Las Pitas", "Las Pitas, Terminal Terrestre, Zona Militar, Urna, UTPL", "6:35, 7:05, 13:30 (L-M-M-J-V)"],
            ["Predesur", "Predesur, Hipervalle, Calasanz, Terminal Terrestre, Zona Militar, Urna, UTPL", "9:30, 10:30, 11:30, 12:00, 12:30, 16:30, 17:30, 18:00 (L-M-M-J-V)"],
            ["Sauces Norte", "Sauces Norte, Av. 8 de Diciembre, Clínica Natali, Las Pitas, Terminal Terrestre, Zona Militar, Urna, UTPL", "7:25, 14:25 (L-M-M-J-V)"],
            ["Rosales", "Rosales, Pradera, Av. Kigman, Parque Infantil, Estadio, La Salle, Colegio Beatriz Cueva de Ayora, Urna, UTPL", "7:25 (L-M-M-J-V)"],
            ["Estadio", "Utpl, Tame, La Salle, Estadio, Urna", "9:30, 10:30, 11:30, 12:00, 12:30, 16:30, 17:30, 18:00 (L-M-M-J-V)"],
            ["Puerta de la Ciudad", "Puerta de la Ciudad, José A. Eguiguren, Mercadillo, Lauro Guerrero, Urna", "9:30, 10:30, 11:30, 12:00, 12:30, 16:30, 17:30, 18:00 (L-M-M-J-V)"],
        ]

    def barrios_salida():
        return [
            ["Parque Infantil", "Rosales, Pradera, Kigman, Estadio, La Salle, Colegio Beatriz Cueva de Ayora", "17:25 (L-M-M-J-V)"],
            ["Migas", "Parque Infantil, Colegio Beatriz Cueva de Ayora", "16:30 (L-M-M-J-V)"],
            ["La Salle", "Rosales, Pradera, Kigman, Estadio, Colegio Beatriz Cueva de Ayora", "14:30 (L-M-M-J-V)"],
            ["Urna", "Ciudad Alegría, Avenida Eloy Alfaro, Tnte. Geovany Calle", "16:25, 17:25, 14:30 (L-M-M-J-V)"],
            ["Universidad UTPL", "Ciudad Alegría, Tebaida Baja, Sauces Norte, Zona Militar", "16:30, 7:30, 8:30, 14:30 (L-M-M-J-V)"],
            ["Parqueadero Polideportivo", "Ciudad Alegría, Tebaida Baja, Zona Militar", "16:55, 18:25, 14:25 (L-M-M-J-V)"],
            ["Redondel del Soldado", "Casa de Enfermeros Terminales", "16:30 (L-M-M-J-V)"],
            ["Cabo Minacho", "Iglesia Verbo, Casa de Enfermeros Terminales", "16:30 (L-M-M-J-V)"],
            ["Coliseo Ciudad de Loja", "Tebaida Baja, Occidental, El Bosque", "16:55, 7:25, 14:30 (L-M-M-J-V)"],
            ["Zona Militar", "Hipervalle, Calasanz, Las Pitas", "16:30, 17:30, 18:30, 14:30 (L-M-M-J-V)"],
            ["Terminal Terrestre", "Sauces Norte, Avenida 8 de Diciembre", "17:25, 14:25 (L-M-M-J-V)"],
        ]

    while True:
        print(
            "\n¿Qué desea ver?\n"
            "1. Barrios\n"
            "2. Rutas de entrada\n"
            "3. Rutas de salida\n"
            "4. Salir\n"
        )
        try:
            opcion = int(input("Ingrese su opción: "))
        except ValueError:
            print("Por favor, ingrese un número válido.")
            continue

        if opcion == 1:
            mostrar_barrios()
        elif opcion == 2:
            mostrar_rutas_entrada()
        elif opcion == 3:
            mostrar_rutas_salida()
        elif opcion == 4:
            print("Saliendo del sistema...")
            sys.exit()
        else:
            print("Opción no válida. Por favor, intente nuevamente.")

if __name__ == "__main__":
    main()