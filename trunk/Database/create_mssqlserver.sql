/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v4.1.3                     */
/* Target DBMS:           MS SQL Server 2005                              */
/* Project file:          Project2.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database creation script                        */
/* Created on:            2012-03-16 09:21                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Tables                                                                 */
/* ---------------------------------------------------------------------- */

/* ---------------------------------------------------------------------- */
/* Add table "Users"                                                      */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Users] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [UserName] VARCHAR(40),
    [Pass] VARCHAR(40),
    [FullName] VARCHAR(40),
    [Address] VARCHAR(40),
    [Email] VARCHAR(40),
    [PhoneNumber] VARCHAR(40),
    [Gender] INTEGER,
    [RoleID] INTEGER,
    CONSTRAINT [PK_Users] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Roles"                                                      */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Roles] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [RoleName] VARCHAR(40),
    CONSTRAINT [PK_Roles] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Functions"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Functions] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [FunctionName] VARCHAR(40),
    CONSTRAINT [PK_Functions] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Grants"                                                     */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Grants] (
    [FunctionID] INTEGER NOT NULL,
    [RoleID] INTEGER NOT NULL,
    CONSTRAINT [PK_Grants] PRIMARY KEY ([FunctionID], [RoleID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Inventory"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Inventory] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [ProductID] INTEGER,
    [Status] VARCHAR(40),
    [PriceSale] NUMERIC,
    [Sold (da ban)] VARCHAR(40),
    [Quantity hientai] VARCHAR(40),
    CONSTRAINT [PK_Inventory] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Categories"                                                 */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Categories] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [CategoriesName] VARCHAR(40),
    CONSTRAINT [PK_Categories] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Customers"                                                  */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Customers] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Name] VARCHAR(40),
    [Address] VARCHAR(40),
    [PhoneNumber] VARCHAR(40),
    [Email] VARCHAR(40),
    [Status] VARCHAR(40),
    [Gender] INTEGER,
    CONSTRAINT [PK_Customers] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Bills"                                                      */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Bills] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [SalemenID] INTEGER,
    [Date] VARCHAR(40),
    [CustomerID] INTEGER,
    CONSTRAINT [PK_Bills] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "BillDetails"                                                */
/* ---------------------------------------------------------------------- */

CREATE TABLE [BillDetails] (
    [ID] INTEGER NOT NULL,
    [Quantity] VARCHAR(40),
    [BillID] INTEGER,
    [Price] NUMERIC,
    [ProductID] INTEGER,
    CONSTRAINT [PK_BillDetails] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "ItemsReturn"                                                */
/* ---------------------------------------------------------------------- */

CREATE TABLE [ItemsReturn] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [BillID] INTEGER,
    [ItemID] INTEGER,
    [Quantity] INTEGER,
    [Reason] VARCHAR(1000),
    [UserID] INTEGER,
    CONSTRAINT [PK_ItemsReturn] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Imported"                                                   */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Imported] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Date] DATETIME,
    [ManufacturerID] INTEGER,
    [InventoryID] INTEGER,
    CONSTRAINT [PK_Imported] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Manufacturers"                                              */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Manufacturers] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Name] VARCHAR(40),
    [Address] VARCHAR(40),
    [Email] VARCHAR(40),
    [PhoneNumber] VARCHAR(40),
    CONSTRAINT [PK_Manufacturers] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "Product"                                                    */
/* ---------------------------------------------------------------------- */

CREATE TABLE [Product] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [Name] VARCHAR(40),
    [CategoriesID] INTEGER,
    CONSTRAINT [PK_Product] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Add table "ImportedDetail"                                             */
/* ---------------------------------------------------------------------- */

CREATE TABLE [ImportedDetail] (
    [ID] INTEGER IDENTITY(0,1) NOT NULL,
    [ProductID] INTEGER,
    [Quantity] INTEGER,
    [Price] NUMERIC,
    [ImportedID] INTEGER,
    CONSTRAINT [PK_ImportedDetail] PRIMARY KEY ([ID])
)
GO

/* ---------------------------------------------------------------------- */
/* Foreign key constraints                                                */
/* ---------------------------------------------------------------------- */

ALTER TABLE [Users] ADD CONSTRAINT [Roles_Users] 
    FOREIGN KEY ([RoleID]) REFERENCES [Roles] ([ID])
GO

ALTER TABLE [Grants] ADD CONSTRAINT [Roles_Grants] 
    FOREIGN KEY ([RoleID]) REFERENCES [Roles] ([ID])
GO

ALTER TABLE [Grants] ADD CONSTRAINT [Functions_Grants] 
    FOREIGN KEY ([FunctionID]) REFERENCES [Functions] ([ID])
GO

ALTER TABLE [Inventory] ADD CONSTRAINT [Product_Inventory] 
    FOREIGN KEY ([ProductID]) REFERENCES [Product] ([ID])
GO

ALTER TABLE [Bills] ADD CONSTRAINT [Customers_Bills] 
    FOREIGN KEY ([CustomerID]) REFERENCES [Customers] ([ID])
GO

ALTER TABLE [Bills] ADD CONSTRAINT [Users_Bills] 
    FOREIGN KEY ([SalemenID]) REFERENCES [Users] ([ID])
GO

ALTER TABLE [BillDetails] ADD CONSTRAINT [Bills_BillDetails] 
    FOREIGN KEY ([BillID]) REFERENCES [Bills] ([ID])
GO

ALTER TABLE [BillDetails] ADD CONSTRAINT [Product_BillDetails] 
    FOREIGN KEY ([ProductID]) REFERENCES [Product] ([ID])
GO

ALTER TABLE [ItemsReturn] ADD CONSTRAINT [Bills_ItemsReturn] 
    FOREIGN KEY ([BillID]) REFERENCES [Bills] ([ID])
GO

ALTER TABLE [ItemsReturn] ADD CONSTRAINT [Users_ItemsReturn] 
    FOREIGN KEY ([UserID]) REFERENCES [Users] ([ID])
GO

ALTER TABLE [Imported] ADD CONSTRAINT [Inventory_Imported] 
    FOREIGN KEY ([InventoryID]) REFERENCES [Inventory] ([ID])
GO

ALTER TABLE [Imported] ADD CONSTRAINT [Manufacturers_Imported] 
    FOREIGN KEY ([ManufacturerID]) REFERENCES [Manufacturers] ([ID])
GO

ALTER TABLE [Product] ADD CONSTRAINT [Categories_Product] 
    FOREIGN KEY ([CategoriesID]) REFERENCES [Categories] ([ID])
GO

ALTER TABLE [ImportedDetail] ADD CONSTRAINT [Imported_ImportedDetail] 
    FOREIGN KEY ([ImportedID]) REFERENCES [Imported] ([ID])
GO

ALTER TABLE [ImportedDetail] ADD CONSTRAINT [Product_ImportedDetail] 
    FOREIGN KEY ([ProductID]) REFERENCES [Product] ([ID])
GO
