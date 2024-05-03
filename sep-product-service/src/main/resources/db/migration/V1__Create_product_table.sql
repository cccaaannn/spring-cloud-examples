CREATE TABLE IF NOT EXISTS `product` (
	`id` BINARY(16) NOT NULL,
	`name` VARCHAR(255) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`description` VARCHAR(1000) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`price` DECIMAL(38,2) NOT NULL,
	`created_at` DATETIME(6) NULL DEFAULT NULL,
	`updated_at` DATETIME(6) NULL DEFAULT NULL,
	`stock_amount` INT(10) NOT NULL,
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb4_0900_ai_ci'
ENGINE=InnoDB
;
