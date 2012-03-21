/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          Project2.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database drop script                            */
/* Created on:            2012-03-21 08:58                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Drop foreign key constraints                                           */
/* ---------------------------------------------------------------------- */

ALTER TABLE [Users] DROP CONSTRAINT [Roles_Users]
GO

ALTER TABLE [Grants] DROP CONSTRAINT [Roles_Grants]
GO

ALTER TABLE [Grants] DROP CONSTRAINT [Functions_Grants]
GO

ALTER TABLE [Inventory] DROP CONSTRAINT [Product_Inventory]
GO

ALTER TABLE [Bills] DROP CONSTRAINT [Customers_Bills]
GO

ALTER TABLE [Bills] DROP CONSTRAINT [Users_Bills]
GO

ALTER TABLE [BillDetails] DROP CONSTRAINT [Bills_BillDetails]
GO

ALTER TABLE [BillDetails] DROP CONSTRAINT [Product_BillDetails]
GO

ALTER TABLE [ItemsReturn] DROP CONSTRAINT [Bills_ItemsReturn]
GO

ALTER TABLE [ItemsReturn] DROP CONSTRAINT [Users_ItemsReturn]
GO

ALTER TABLE [Imported] DROP CONSTRAINT [Manufacturers_Imported]
GO

ALTER TABLE [Product] DROP CONSTRAINT [Categories_Product]
GO

ALTER TABLE [ImportedDetail] DROP CONSTRAINT [Imported_ImportedDetail]
GO

ALTER TABLE [ImportedDetail] DROP CONSTRAINT [Product_ImportedDetail]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Users"                                                     */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Users] DROP CONSTRAINT [PK_Users]
GO

/* Drop table */

DROP TABLE [Users]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Roles"                                                     */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Roles] DROP CONSTRAINT [PK_Roles]
GO

/* Drop table */

DROP TABLE [Roles]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Functions"                                                 */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Functions] DROP CONSTRAINT [PK_Functions]
GO

/* Drop table */

DROP TABLE [Functions]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Grants"                                                    */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Grants] DROP CONSTRAINT [PK_Grants]
GO

/* Drop table */

DROP TABLE [Grants]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Inventory"                                                 */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Inventory] DROP CONSTRAINT [PK_Inventory]
GO

/* Drop table */

DROP TABLE [Inventory]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Categories"                                                */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Categories] DROP CONSTRAINT [PK_Categories]
GO

/* Drop table */

DROP TABLE [Categories]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Customers"                                                 */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Customers] DROP CONSTRAINT [PK_Customers]
GO

/* Drop table */

DROP TABLE [Customers]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Bills"                                                     */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Bills] DROP CONSTRAINT [PK_Bills]
GO

/* Drop table */

DROP TABLE [Bills]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "BillDetails"                                               */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [BillDetails] DROP CONSTRAINT [PK_BillDetails]
GO

/* Drop table */

DROP TABLE [BillDetails]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "ItemsReturn"                                               */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [ItemsReturn] DROP CONSTRAINT [PK_ItemsReturn]
GO

/* Drop table */

DROP TABLE [ItemsReturn]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Imported"                                                  */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Imported] DROP CONSTRAINT [PK_Imported]
GO

/* Drop table */

DROP TABLE [Imported]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Manufacturers"                                             */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Manufacturers] DROP CONSTRAINT [PK_Manufacturers]
GO

/* Drop table */

DROP TABLE [Manufacturers]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "Product"                                                   */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [Product] DROP CONSTRAINT [PK_Product]
GO

/* Drop table */

DROP TABLE [Product]
GO

/* ---------------------------------------------------------------------- */
/* Drop table "ImportedDetail"                                            */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE [ImportedDetail] DROP CONSTRAINT [PK_ImportedDetail]
GO

/* Drop table */

DROP TABLE [ImportedDetail]
GO
