import cv2

<<<<<<< HEAD
image = cv2.imread('C:/Users/Rafi Abiyyu A/Pictures/Snap Code/1.png')
if image is None:
    print('Error: Gambar tidak ada!')
else:
    cv2.imshow('Latihan opencv dulu gasi?', image)
=======
image = cv2.imread("")
if image is None:
    print("Error: Gambar tidak ada!")
else:
    cv2.imshow("Latihan opencv dulu gasi?", image)
>>>>>>> d0befcb (P)
    cv2.waitKey(0)
    cv2.destroyAllWindows()