phys <- c(15,  12,  8,   8,   7,   7,   7,   6,   5,   3)
hist <- c(10,  25,  17,  11,  13,  17,  20,  13,  9,   15)

ph <- cor(phys, hist, use="complete.obs", method="pearson")

write(round(ph, 3), stdout())
