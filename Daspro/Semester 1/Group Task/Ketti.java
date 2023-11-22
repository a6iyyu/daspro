import java.util.Scanner;

public class Ketti {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("SELAMAT DATANG DI KETTI");
            System.out.print("Masukkan nama Anda: ");
            String name = input.nextLine();

            if (charChecker(name)) {
                System.out.println("Error: Nama tidak boleh memuat angka!");
            } else if (name.length() > 20) {
                System.out.println("Error: Nama tidak boleh melebihi dari 20 karakter!");
            } else {
                System.out.println("Hai " + name + ", senang berjumpa denganmu!");

                System.out.println("\nDaftar transportasi yang tersedia:");
                System.out.println("1. Kereta Api");
                System.out.println("2. Bus");
                System.out.println("3. Pesawat Terbang");
                System.out.println("4. Kapal Laut");

                System.out.print("Pilih transportasi (tulis dalam angka): ");
                byte chooseTransport = input.nextByte();

                if (chooseTransport > 0 && chooseTransport < 5) {
                    System.out.println("Anda memilih transportasi berupa " + transportName(chooseTransport));

                    if (chooseTransport == 1) {
                        System.out.println("\nDaftar kota yang tersedia:");
                        System.out.println("1. Jakarta");
                        System.out.println("2. Bandung");
                        System.out.println("3. Cirebon");
                        System.out.println("4. Purwokerto");
                        System.out.println("5. Semarang");
                        System.out.println("6. Jogjakarta");
                        System.out.println("7. Solo");
                        System.out.println("8. Madiun");
                        System.out.println("9. Surabaya");
                        System.out.println("10. Malang");
                        System.out.println("11. Jember");
                        System.out.println("12. Ketapang");

                        System.out.print("Pilih kota keberangkatan Anda: ");
                        byte chooseDepartureTrain = input.nextByte();

                        if (chooseDepartureTrain > 0 && chooseDepartureTrain < 13) {
                            System.out.println("Anda memilih kota keberangkatan Anda yaitu Kota " + departureTrainName(chooseDepartureTrain));
                            System.out.print("Pilih kota tujuan Anda: ");
                            byte chooseDestinationTrain = input.nextByte();
                            
                            if (chooseDestinationTrain == chooseDepartureTrain) {
                                System.out.println("Error: Anda memasukkan kota tujuan yang sama dengan kota keberangkatan!");
                            } else if (chooseDestinationTrain > 12) {
                                System.out.println("Error: Harap Anda masukkan angka dari 1 sampai 12!");
                            } else {
                                System.out.print("Anda memilih kota tujuan Anda yaitu Kota " + destinationTrainName(chooseDestinationTrain));
                            }

                        } else {
                            System.out.println("Error: Harap masukkan angka 1 hingga 12!");
                        }
                    }

                    else if (chooseTransport == 2) {
                        System.out.println("\nDaftar kota yang tersedia:");
                        System.out.println("1. Jakarta");
                        System.out.println("2. Bandung");
                        System.out.println("3. Medan");
                        System.out.println("4. Denpasar");
                        System.out.println("5. Semarang");
                        System.out.println("6. Jogjakarta");
                        System.out.println("7. Solo");
                        System.out.println("8. Palembang");
                        System.out.println("9. Surabaya");
                        System.out.println("10. Malang");
                        System.out.println("11. Jember");
                        System.out.println("12. Padang");

                        System.out.print("Pilih kota keberangkatan Anda: ");
                        byte chooseDepartureBus = input.nextByte();

                        if (chooseDepartureBus > 0 && chooseDepartureBus < 13) {
                            System.out.println("Anda memilih kota keberangkatan Anda yaitu Kota " + departureBusName(chooseDepartureBus));
                            System.out.print("Pilih kota tujuan Anda: ");
                            byte chooseDestinationBus = input.nextByte();

                            if (chooseDestinationBus == chooseDepartureBus) {
                                System.out.println("Error: Anda memasukkan kota tujuan yang sama dengan kota keberangkatan!");
                            } else if (chooseDestinationBus > 12) {
                                System.out.println("Error: Harap Anda masukkan angka dari 1 sampai 12!");
                            } else {
                                System.out.print("Anda memilih kota tujuan Anda yaitu Kota " + destinationTrainName(chooseDestinationBus));
                            }

                        } else {
                            System.out.println("Error: Harap masukkan angka 1 hingga 12!");
                        }
                    }

                    else if (chooseTransport == 3) {
                        System.out.println("\nDaftar kota keberangkatan yang tersedia:");
                        System.out.println("1. Jakarta");
                        System.out.println("2. Kertapati");
                        System.out.println("3. Medan");
                        System.out.println("4. Denpasar");
                        System.out.println("5. Lombok");
                        System.out.println("6. Jogjakarta");
                        System.out.println("7. Jayapura");
                        System.out.println("8. Palembang");

                        System.out.print("Pilih kota keberangkatan Anda: ");
                        byte chooseDepartureAirplane = input.nextByte();

                        if (chooseDepartureAirplane > 0 && chooseDepartureAirplane < 9) {
                            System.out.println("Anda memilih kota keberangkatan Anda yaitu Kota " + departureAirplaneName(chooseDepartureAirplane));
                            System.out.print("Pilih kota tujuan Anda: ");
                            byte chooseDestinationAirplane = input.nextByte();

                            if (chooseDestinationAirplane == chooseDepartureAirplane) {
                                System.out.println("Error: Anda memasukkan kota tujuan yang sama dengan kota keberangkatan!");
                            } else if (chooseDestinationAirplane > 12) {
                                System.out.println("Error: Harap Anda masukkan angka dari 1 sampai 12!");
                            } else {
                                System.out.print("Anda memilih kota tujuan Anda yaitu Kota " + destinationAirplaneName(chooseDestinationAirplane));
                            }

                        } else {
                            System.out.println("Error: Harap masukkan angka 1 hingga 8!");
                        }  
                    }
                    
                    else if (chooseTransport == 4) {
                        System.out.println("\nDaftar pelabuhan yang tersedia:");
                        System.out.println("1. Tanjung Priok");
                        System.out.println("2. Merak");
                        System.out.println("3. Harbour Bay");
                        System.out.println("4. Kandidi Reo");
                        System.out.println("5. Merauke");
                        System.out.println("6. Tanjung Perak");
                        System.out.println("7. Bakauheni");
                        System.out.println("8. Soekarno-Hatta");

                        System.out.print("Pilih pelabuhan keberangkatan Anda: ");
                        byte chooseDepartureShip = input.nextByte();

                        if (chooseDepartureShip > 0 && chooseDepartureShip < 9) {
                            System.out.println("Anda memilih pelabuhan keberangkatan Anda yaitu Pelabuhan " + departureShipName(chooseDepartureShip));
                            System.out.print("Pilih pelabuhan tujuan Anda: ");
                            byte chooseDestinationShip = input.nextByte();

                            if (chooseDestinationShip == chooseDepartureShip) {
                                System.out.println("Error: Anda memasukkan pelabuhan tujuan yang sama dengan pelabuhan keberangkatan!");
                            } else if (chooseDestinationShip > 12) {
                                System.out.println("Error: Harap Anda masukkan angka dari 1 sampai 12!");
                            } else {
                                System.out.print("Anda memilih pelabuhan tujuan Anda yaitu Pelabuhan " + destinationShipName(chooseDestinationShip));
                            }

                        } else {
                            System.out.println("Error: Harap masukkan angka 1 hingga 8!");
                        }  

                    } else {
                        return;
                    }

                } else {
                    System.out.println("Error: Harap masukkan angka dari 1 hingga 4!");
                }
            }
        }
    }

    public static boolean charChecker(String isAnotherChar) {
        for (char checkNumber : isAnotherChar.toCharArray()) {
            if (Character.isDigit(checkNumber)) {
                return true;
            }
        }
        return false;
    }

    public static String transportName(byte transportNumber) {
        switch (transportNumber) {
            case 1:
                return "Kereta Api";
            case 2:
                return "Bus";
            case 3:
                return "Pesawat Terbang";
            case 4:
                return "Kapal Laut";
            default:
                return "Tidak valid";
        }
    }

    public static String departureTrainName (byte departureTrainNumber) {
        switch (departureTrainNumber) {
            case 1:
                return "Jakarta";
            case 2:
                return "Bandung";
            case 3:
                return "Cirebon";
            case 4:
                return "Purwokerto";
            case 5:
                return "Semarang";
            case 6:
                return "Jogjakarta";
            case 7:
                return "Solo";
            case 8:
                return "Madiun";
            case 9:
                return "Surabaya";
            case 10:
                return "Malang";
            case 11:
                return "Jember";
            case 12:
                return "Ketapang";
            default:
                return "Tidak valid";
        }
    }

    public static String destinationTrainName (byte destinationTrainNumber) {
        switch (destinationTrainNumber) {
            case 1:
                return "Jakarta";
            case 2:
                return "Bandung";
            case 3:
                return "Cirebon";
            case 4:
                return "Purwokerto";
            case 5:
                return "Semarang";
            case 6:
                return "Jogjakarta";
            case 7:
                return "Solo";
            case 8:
                return "Madiun";
            case 9:
                return "Surabaya";
            case 10:
                return "Malang";
            case 11:
                return "Jember";
            case 12:
                return "Ketapang";
            default:
                return "Tidak valid";
        }
    }

    public static String departureBusName (byte departureBusNumber) {
        switch (departureBusNumber) {
            case 1:
                return "Jakarta";
            case 2:
                return "Bandung";
            case 3:
                return "Medan";
            case 4:
                return "Denpasar";
            case 5:
                return "Semarang";
            case 6:
                return "Jogjakarta";
            case 7:
                return "Solo";
            case 8:
                return "Palembang";
            case 9:
                return "Surabaya";
            case 10:
                return "Malang";
            case 11:
                return "Jember";
            case 12:
                return "Padang";
            default:
                return "Tidak valid";
        }
    }

    public static String destinationBusName (byte destinationBusNumber) {
        switch (destinationBusNumber) {
            case 1:
                return "Jakarta";
            case 2:
                return "Bandung";
            case 3:
                return "Medan";
            case 4:
                return "Denpasar";
            case 5:
                return "Semarang";
            case 6:
                return "Jogjakarta";
            case 7:
                return "Solo";
            case 8:
                return "Palembang";
            case 9:
                return "Surabaya";
            case 10:
                return "Malang";
            case 11:
                return "Jember";
            case 12:
                return "Padang";
            default:
                return "Tidak valid";
        }
    }

    public static String departureAirplaneName (byte departureAirplaneNumber) {
        switch (departureAirplaneNumber) {
            case 1:
                return "Jakarta";
            case 2:
                return "Kertapati";
            case 3:
                return "Medan";
            case 4:
                return "Denpasar";
            case 5:
                return "Lombok";
            case 6:
                return "Jogjakarta";
            case 7:
                return "Jayapura";
            case 8:
                return "Palembang";
            default:
                return "Tidak valid";
        }
    }

    public static String destinationAirplaneName (byte destinationAirplaneNumber) {
        switch (destinationAirplaneNumber) {
            case 1:
                return "Jakarta";
            case 2:
                return "Kertapati";
            case 3:
                return "Medan";
            case 4:
                return "Denpasar";
            case 5:
                return "Lombok";
            case 6:
                return "Jogjakarta";
            case 7:
                return "Jayapura";
            case 8:
                return "Palembang";
            default:
                return "Tidak valid";
        }
    }

    public static String departureShipName (byte departureShipNumber) {
        switch (departureShipNumber) {
            case 1:
                return "Tanjung Priok";
            case 2:
                return "Merak";
            case 3:
                return "Harbour Bay";
            case 4:
                return "Kandidi Reo";
            case 5:
                return "Merauke";
            case 6:
                return "Tanjung Perak";
            case 7:
                return "Bakauheni";
            case 8:
                return "Soekarno-Hatta";
            default:
                return "Tidak valid";
        }
    }

    public static String destinationShipName (byte destinationShipNumber) {
        switch (destinationShipNumber) {
            case 1:
                return "Tanjung Priok";
            case 2:
                return "Merak";
            case 3:
                return "Harbour Bay";
            case 4:
                return "Kandidi Reo";
            case 5:
                return "Merauke";
            case 6:
                return "Tanjung Perak";
            case 7:
                return "Bakauheni";
            case 8:
                return "Soekarno-Hatta";
            default:
                return "Tidak valid";
        }
    }
}