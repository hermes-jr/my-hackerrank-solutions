pn1 <- 1 - pnorm(80, 70, 10)
write(round(pn1 * 100, 2), stdout())
pn2 <- 1 - (pnorm(60, 70, 10) - pnorm(0, 70, 10))
write(round(pn2 * 100, 2), stdout())
pn3 <- pnorm(60, 70, 10)
write(round(pn3 * 100, 2), stdout())