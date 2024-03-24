export class Product {
    constructor(
        public sku: string,
        public name: string,
        public description: string,
        public unitPrice: number,
        public unitsInStock: number,
        public active: boolean,
        public imageUrl: string,
        public rating: number,
        public createdAt: Date,
        public updatedAt: Date
    ) {

    }
}
