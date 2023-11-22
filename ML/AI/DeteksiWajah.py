import cv2

<<<<<<< HEAD
image = cv2.imread('E:/Tri Sundari.jpg')
if image is None:
    print('Error: Gambar tidak ada!')
else:
    face_cascade = cv2.CascadeClassifier(cv2.data.haarcascades + 'haarcascade_frontalface_default.xml')
    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
    faces = face_cascade.detectMultiScale(gray, scaleFactor = 1.3, minNeighbors = 5, minSize = (30, 30))
    for (x, y, w, h) in faces:
        cv2.rectangle(image, (x, y), (x + w, y + h), (0, 0, 0), 2)
        cv2.imshow('Belajar deteksi wajah.', image)
=======
image = cv2.imread("")
if image is None:
    print("Error: Gambar tidak ada!")
else:
    face_cascade = cv2.CascadeClassifier(
        cv2.data.haarcascades + "haarcascade_frontalface_default.xml")
    gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
    faces = face_cascade.detectMultiScale(
        gray, scaleFactor=1.3, minNeighbors=5, minSize=(30, 30))
    for (x, y, w, h) in faces:
        cv2.rectangle(image, (x, y), (x + w, y + h), (0, 0, 0), 2)
        cv2.imshow("Belajar deteksi wajah.", image)
>>>>>>> d0befcb (P)
        cv2.waitKey(0)
        cv2.destroyAllWindows()