phys <- c(15,  12,  8,   8,   7,   7,   7,   6,   5, 3)
# hist <- c(25,  17,  11,  13,  17,  20,  13,  9,   15)
hist <- c(10, 25,  17,  11,  13,  17,  20,  13,  9,   15) # how hard can it be to PROPERLY WRITE A FUCKING TASK?!

model = lm(formula = hist ~ phys, na.action = na.exclude)

newv <- data.frame(phys = 10)
vanga <- predict(model, newv, se.fit = T)
write(round(vanga$fit, 1), stdout())