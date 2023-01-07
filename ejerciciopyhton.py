n=1
cp=0
ci=0

while(n!=0):
 n=int(input("Digite los numeros :"))
if (n%2)==0:
  cp+=1
else:
  ci+=1

print("La cantidad de numeros pares es :",cp)
print("La cantidad de numeros impares es :",ci)
