# Proyecto: Javita

## Comandos GIT

1. Comando para clonar repositorio
```
git clone https://github.com/WillianCahuaya/Javita.git
```
2. Para ver el estado de la branch
```
git status
```
3. Para crear un nuevo branch
```
git branch <<newbranch>>
git branch develop
```
4. Para ver los branch actuales que tienes actualmente
```
git branch
git branch -all
```
5. Para cambiar de una rama a otra
```
git checkout <<branch>>
git checkout develop
```
6. Para traer los cambios del repositorio remoto al repositorio local
```
git pull origin <<branch>>
git pull origin develop
```
7. Actualizar todos los branch existente
```
git fetch origin
```
8. Para commitear los cambios a repositorio local
```
git commit -m "Su mensaje respectivo"
```
9. Para publicar los cambios en repositorio remoto
```
git push origin <<branch>>
git push origin develop
```