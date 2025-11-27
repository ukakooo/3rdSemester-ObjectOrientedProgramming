/*
 Navicat Premium Dump SQL

 Source Server         : Le MySQL
 Source Server Type    : MySQL
 Source Server Version : 80403 (8.4.3)
 Source Host           : localhost:3306
 Source Schema         : dbperpus

 Target Server Type    : MySQL
 Target Server Version : 80403 (8.4.3)
 File Encoding         : 65001

 Date: 27/11/2025 23:49:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for anggota
-- ----------------------------
DROP TABLE IF EXISTS `anggota`;
CREATE TABLE `anggota`  (
  `idanggota` int NOT NULL AUTO_INCREMENT,
  `nama` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `alamat` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `telepon` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idanggota`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of anggota
-- ----------------------------
INSERT INTO `anggota` VALUES (1, 'Spinosaurus Aegyptiacus', 'North Africa', '1234567890');
INSERT INTO `anggota` VALUES (2, 'Giganotosaurus Carolinii', 'Argentina', '0987654321');
INSERT INTO `anggota` VALUES (3, 'Tyrannosaurus Rex', 'North America', '1122334455');

-- ----------------------------
-- Table structure for buku
-- ----------------------------
DROP TABLE IF EXISTS `buku`;
CREATE TABLE `buku`  (
  `idbuku` int NOT NULL AUTO_INCREMENT,
  `idkategori` int NOT NULL,
  `judul` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `penerbit` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `penulis` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idbuku`) USING BTREE,
  INDEX `fk_buku_kategori`(`idkategori` ASC) USING BTREE,
  CONSTRAINT `fk_buku_kategori` FOREIGN KEY (`idkategori`) REFERENCES `kategori` (`idkategori`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of buku
-- ----------------------------
INSERT INTO `buku` VALUES (1, 1, 'Jurassic Park 3', 'Ballantine Books', 'Michael Crichton');
INSERT INTO `buku` VALUES (2, 3, 'Jurassic World', 'Scholastic Inc', 'Tess Sharpe');
INSERT INTO `buku` VALUES (3, 3, 'Jurassic World: Dominion', 'Random House', 'Emily Carmichael');
INSERT INTO `buku` VALUES (7, 3, 'The Sphere', 'Wayne Publisher', 'Michael Chrichton');

-- ----------------------------
-- Table structure for kategori
-- ----------------------------
DROP TABLE IF EXISTS `kategori`;
CREATE TABLE `kategori`  (
  `idkategori` int NOT NULL AUTO_INCREMENT,
  `nama` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `keterangan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`idkategori`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of kategori
-- ----------------------------
INSERT INTO `kategori` VALUES (1, 'Novel', 'Koleksi buku novel');
INSERT INTO `kategori` VALUES (2, 'Referensi', 'Koleksi buku referensi ilmiah');
INSERT INTO `kategori` VALUES (3, 'Fiksi', 'Koleksi buku dimana hampir segala hal di dalam bukunya bersifat fiktif, yaitu tidak nyata, baik dalam secara logika maupun cerita.');

-- ----------------------------
-- Table structure for peminjaman
-- ----------------------------
DROP TABLE IF EXISTS `peminjaman`;
CREATE TABLE `peminjaman`  (
  `idpeminjaman` int NOT NULL AUTO_INCREMENT,
  `idanggota` int NOT NULL,
  `idbuku` int NOT NULL,
  `tanggalpinjam` date NULL DEFAULT NULL,
  `tanggalkembali` date NULL DEFAULT NULL,
  PRIMARY KEY (`idpeminjaman`) USING BTREE,
  INDEX `fk_peminjaman_anggota`(`idanggota` ASC) USING BTREE,
  INDEX `fk_peminjaman_buku`(`idbuku` ASC) USING BTREE,
  CONSTRAINT `fk_peminjaman_anggota` FOREIGN KEY (`idanggota`) REFERENCES `anggota` (`idanggota`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_peminjaman_buku` FOREIGN KEY (`idbuku`) REFERENCES `buku` (`idbuku`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of peminjaman
-- ----------------------------
INSERT INTO `peminjaman` VALUES (1, 1, 1, '2023-11-01', '2023-11-08');
INSERT INTO `peminjaman` VALUES (2, 2, 2, '2023-11-05', '2023-11-12');
INSERT INTO `peminjaman` VALUES (3, 3, 3, '2023-11-10', '2023-11-17');

SET FOREIGN_KEY_CHECKS = 1;
