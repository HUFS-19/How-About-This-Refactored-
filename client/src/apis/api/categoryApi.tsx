import { API } from '../utils/instance';

interface CategoryData {
  cateId: number;
  cateName: string;
}

export const getAllCateName = async (): Promise<CategoryData[]> => {
  try {
    const response = await API.get(`categoryAPI/all`);
    const data: CategoryData[] = response.data.map((item: any) => ({
      cateId: item.cateID,
      cateName: item.cateNAME,
    }));
    return data;
  } catch (error) {
    console.error('Error getAllCateName:', error);
    return [];
  }
};
